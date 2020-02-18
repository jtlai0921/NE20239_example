// $Id: SQLExceptionConverterFactory.java,v 1.2 2004/11/19 01:14:20 steveebersole Exp $
package net.sf.hibernate.exception;

import net.sf.hibernate.cfg.Environment;
import net.sf.hibernate.util.StringHelper;
import net.sf.hibernate.util.ReflectHelper;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.JDBCException;
import net.sf.hibernate.dialect.Dialect;

import java.util.Properties;
import java.sql.SQLException;
import java.lang.reflect.Constructor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * A factory for building SQLExceptionConverter instances.
 *
 * @author Steve Ebersole
 */
public class SQLExceptionConverterFactory {

	private static final Log log = LogFactory.getLog(SQLExceptionConverterFactory.class);

	/**
	 * Build a SQLExceptionConverter instance.
	 * <p/>
	 * First, looks for a {@link Environment.SQL_EXCEPTION_CONVERTER} property to see
	 * if the configuration specified the class of a specific converter to use.  If this
	 * property is set, attempt to construct an instance of that class.  If not set, or
	 * if construction fails, the converter specific to the dialect will be used.
	 *
	 * @param dialect The defined dialect.
	 * @param properties The configuration properties.
	 * @return An appropriate SQLExceptionConverter instance.
	 * @throws HibernateException There was an error building the SQLExceptionConverter.
	 */
	public static SQLExceptionConverter buildSQLExceptionConverter(Dialect dialect, Properties properties) throws HibernateException {
		SQLExceptionConverter converter = null;

		String converterClassName = (String) properties.get(Environment.SQL_EXCEPTION_CONVERTER);
		if (StringHelper.isNotEmpty(converterClassName)) {
			converter = constructConverter(converterClassName, dialect.getViolatedConstraintNameExtracter());
		}

		if (converter == null) {
			log.trace("Using dialect defined converter");
			converter = dialect.buildSQLExceptionConverter();
		}

		if (converter instanceof Configurable) {
			try {
				((Configurable) converter).configure(properties);
			} catch (HibernateException e) {
				log.warn("Unable to configure SQLExceptionConverter", e);
				throw e;
			}
		}

		return converter;
	}

	/**
	 * Builds a minimal converter.  The instance returned here just always converts to
	 * {@link GenericJDBCException}.
	 *
	 * @return The minimal converter.
	 */
	public static SQLExceptionConverter buildMinimalSQLExceptionConverter() {
		return new SQLExceptionConverter() {
			public JDBCException convert(SQLException sqlException, String message) {
				return new GenericJDBCException(message, sqlException);
			}
		};
	}

	private static SQLExceptionConverter constructConverter(String converterClassName, ViolatedConstraintNameExtracter violatedConstraintNameExtracter) {
		try {
			log.trace("Attempting to construct instance of specified SQLExceptionConverter [" + converterClassName + "]");
			Class converterClass = ReflectHelper.classForName(converterClassName);

			// First, try to find a matching constructor accepting a ViolatedConstraintNameExtracter param...
			Constructor[] ctors = converterClass.getDeclaredConstructors();
			for (int i = 0; i < ctors.length; i++) {
				if (ctors[i].getParameterTypes() != null && ctors[i].getParameterTypes().length == 1) {
					if (ViolatedConstraintNameExtracter.class.isAssignableFrom(ctors[i].getParameterTypes()[0])) {
						try {
							return (SQLExceptionConverter)
							        ctors[i].newInstance(new Object[]{violatedConstraintNameExtracter});
						} catch (Throwable t) {
							// eat it and try next
						}
					}
				}
			}

			// Otherwise, try to use the no-arg constructor
			return (SQLExceptionConverter) converterClass.newInstance();

		} catch (Throwable t) {
			log.warn("Unable to construct instance of specified SQLExceptionConverter", t);
		}

		return null;
	}
}
