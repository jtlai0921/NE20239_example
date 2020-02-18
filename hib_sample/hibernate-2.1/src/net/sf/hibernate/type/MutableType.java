//$Id: MutableType.java,v 1.9 2005/01/29 23:01:54 oneovthafew Exp $
package net.sf.hibernate.type;

import java.util.Map;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.engine.SessionImplementor;

/**
 * Superclass for mutable nullable types
 * @author Gavin King
 */
public abstract class MutableType extends NullableType {
	
	public final boolean isMutable() {
		return true;
	}
	
	public boolean hasNiceEquals() {
		return false; //default ... may be overridden
	}
	
	public Object copy(
		Object original,
		Object target,
		SessionImplementor session,
		Object owner, Map copiedAlready)
		throws HibernateException {
		return deepCopy(original);
	}

}






