//$Id: ShortType.java,v 1.11 2004/09/04 01:17:48 oneovthafew Exp $
package net.sf.hibernate.type;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Comparator;

import net.sf.hibernate.util.ComparableComparator;

/**
 * <tt>short</tt>: A type that maps an SQL SMALLINT to a Java Short.
 * @author Gavin King
 */
public class ShortType extends PrimitiveType  implements DiscriminatorType, VersionType {
	
	private static final Short ZERO = new Short( (short) 0 );
	
	public Object get(ResultSet rs, String name) throws SQLException {
		return new Short( rs.getShort(name) );
	}
	
	public Class getPrimitiveClass() {
		return short.class;
	}
	
	public Class getReturnedClass() {
		return Short.class;
	}
	
	public void set(PreparedStatement st, Object value, int index) throws SQLException {
		st.setShort( index, ( (Short) value ).shortValue() );
	}
	
	public int sqlType() {
		return Types.SMALLINT;
	}
	
	public String getName() { return "short"; }
	
	public String objectToSQLString(Object value) throws Exception {
		return value.toString();
	}
	
	public Object stringToObject(String xml) throws Exception {
		return new Short(xml);
	}
	
	public Object next(Object current) {
		return new Short( (short) ( ( (Short) current ).shortValue() + 1 ) );
	}
	
	public Object seed() {
		return ZERO;
	}
	
	public Object fromStringValue(String xml) {
		return new Short(xml);
	}
	
	public Comparator getComparator() {
		return ComparableComparator.INSTANCE;
	}
	
}





