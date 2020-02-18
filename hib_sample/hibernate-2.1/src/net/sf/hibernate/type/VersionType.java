//$Id: VersionType.java,v 1.8 2004/09/04 01:17:48 oneovthafew Exp $
package net.sf.hibernate.type;

import java.util.Comparator;

/**
 * A <tt>Type</tt> that may be used to version data.
 * @author Gavin King
 */
public interface VersionType extends Type {
	/**
	 * Generate an initial version.
	 * @return an instance of the type
	 */
	public Object seed();
	/**
	 * Increment the version.
	 * @param current the current version
	 * @return an instance of the type
	 */
	public Object next(Object current);
	/**
	 * Get a comparator for the version numbers
	 * @return a comparator
	 */
	public Comparator getComparator();
}






