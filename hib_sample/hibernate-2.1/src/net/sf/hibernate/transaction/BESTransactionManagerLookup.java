//$Id: BESTransactionManagerLookup.java,v 1.2 2004/08/20 07:44:37 oneovthafew Exp $
package net.sf.hibernate.transaction;

/**
 * A <tt>TransactionManager</tt> lookup strategy for Borland ES.
 * @author Etienne Hardy
 */
public final class BESTransactionManagerLookup extends JNDITransactionManagerLookup {

	protected String getName() {
		return "java:pm/TransactionManager";
	}
	
	public String getUserTransactionName() {
		return "java:comp/UserTransaction";
	}
	
}






