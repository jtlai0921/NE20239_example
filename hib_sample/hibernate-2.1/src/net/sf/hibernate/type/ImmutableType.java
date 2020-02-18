//$Id: ImmutableType.java,v 1.9 2005/01/29 23:01:54 oneovthafew Exp $
package net.sf.hibernate.type;

import java.util.Map;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.engine.SessionImplementor;

/**
 * Superclass of nullable immutable types.
 * @author Gavin King
 */
public abstract class ImmutableType extends NullableType {
	
	public final Object deepCopyNotNull(Object value) throws HibernateException {
		return value;
	}
	
	public final boolean isMutable() {
		return false;
	}
	
	public boolean hasNiceEquals() {
		return true;
	}

	public Object copy(
		Object original,
		Object target,
		SessionImplementor session,
		Object owner, Map copiedAlready)
		throws HibernateException {
		
		return original;
	}


}






