//$Id: ComparableComparator.java,v 1.1 2004/09/04 01:17:48 oneovthafew Exp $
package net.sf.hibernate.util;

import java.util.Comparator;

/**
 * Delegates to Comparable
 * @author Gavin King
 */
public class ComparableComparator implements Comparator {

	public int compare(Object x, Object y) {
		return ( (Comparable) x ).compareTo(y);
	}
	
	public static final Comparator INSTANCE = new ComparableComparator();

}
