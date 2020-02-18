//$Id: TestCase.java,v 1.6 2004/09/05 10:02:31 oneovthafew Exp $
package org.hibernate.test;

import java.util.Iterator;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;
import net.sf.hibernate.SessionFactory;
import net.sf.hibernate.cache.CacheConcurrencyStrategy;
import net.sf.hibernate.cache.ReadWriteCache;
import net.sf.hibernate.cfg.Configuration;
import net.sf.hibernate.cfg.Environment;
import net.sf.hibernate.dialect.Dialect;
import net.sf.hibernate.mapping.Collection;
import net.sf.hibernate.mapping.PersistentClass;
import net.sf.hibernate.mapping.Property;
import net.sf.hibernate.mapping.SimpleValue;

public abstract class TestCase extends junit.framework.TestCase {
	
	private static SessionFactory sessions;
	private static Configuration cfg;
	private static Dialect dialect;
	private static Class lastTestClass;
	private Session session;
	
	public TestCase(String x) {
		super(x);
	}
	
	private void buildSessionFactory(String[] files) throws Exception {
		
		if ( getSessions()!=null ) getSessions().close();
		
		try {
		
			setCfg( new Configuration() );
			
			cfg.setProperty(Environment.HBM2DDL_AUTO, "create-drop");
			
			//cfg.setNamingStrategy(ImprovedNamingStrategy.INSTANCE);

			for (int i=0; i<files.length; i++) {
				if ( !files[i].startsWith("net/") ) files[i] = "org/hibernate/test/" + files[i];
				getCfg().addResource( files[i], TestCase.class.getClassLoader() );
			}
			
			if ( getCacheConcurrencyStrategy()!=null ) {
				
				Iterator iter = cfg.getClassMappings();
				while ( iter.hasNext() ) {
					PersistentClass clazz = (PersistentClass) iter.next();
					Iterator props = clazz.getPropertyClosureIterator();
					boolean hasLob = false;
					while ( props.hasNext() ) {
						Property prop = (Property) props.next();
						if ( prop.getValue().isSimpleValue() ) {
							String type = ( (SimpleValue) prop.getValue() ).getType().getName();
							if ( "blob".equals(type) || "clob".equals(type) ) hasLob = true;
						}
					}
					if ( !hasLob && !clazz.isInherited() ) {
						cfg.setCacheConcurrencyStrategy( 
								clazz.getMappedClass(), 
								getCacheConcurrencyStrategy() 
						);
					}
				}
	
				iter = cfg.getCollectionMappings();
				while ( iter.hasNext() ) {
					Collection coll = (Collection) iter.next();
					cfg.setCacheConcurrencyStrategy( 
							coll.getRole(), 
							getCacheConcurrencyStrategy() 
					);
				}
				
			}
			

			setDialect( Dialect.getDialect() );
			
			setSessions( getCfg().buildSessionFactory( /*new TestInterceptor()*/ ) );
			
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}

	public CacheConcurrencyStrategy getCacheConcurrencyStrategy() {
		return new ReadWriteCache();
	}

	protected void setUp() throws Exception {
		if ( getSessions()==null || lastTestClass!=getClass() ) {
			buildSessionFactory( getMappings() );
			lastTestClass = getClass();
		}
	}
	
	protected void runTest() throws Throwable {
		try {
			super.runTest();
			if ( session!=null && session.isOpen() ) {
				if ( session.isConnected() ) session.connection().rollback();
				session.close();
				session = null;
				fail("unclosed session");
			}
			else {
				session=null;
			}
		}
		catch (Throwable e) {
			try {
				if ( session!=null && session.isOpen() ) {
					if ( session.isConnected() ) session.connection().rollback();
					session.close();
				}
			}
			catch (Exception ignore) {}
			try {
				if (sessions!=null) {
					sessions.close();
					sessions=null;
				}
			}
			catch (Exception ignore) {}
			throw e;
		}
	}
	
	public Session openSession() throws HibernateException {
		session = sessions.openSession();
		return session;
	}
	
	protected abstract String[] getMappings();

	private void setSessions(SessionFactory sessions) {
		TestCase.sessions = sessions;
	}

	protected SessionFactory getSessions() {
		return sessions;
	}

	private void setDialect(Dialect dialect) {
		TestCase.dialect = dialect;
	}

	protected Dialect getDialect() {
		return dialect;
	}

	protected static void setCfg(Configuration cfg) {
		TestCase.cfg = cfg;
	}

	protected static Configuration getCfg() {
		return cfg;
	}

}
