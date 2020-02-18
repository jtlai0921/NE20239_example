//$Id: SunONETransactionManagerLookup.java,v 1.7 2004/10/20 01:37:15 oneovthafew Exp $
package net.sf.hibernate.transaction;

/**
 * TransactionManager lookup strategy for Sun ONE Application Server 7
 * @author Robert Davidson, Sanjeev Krishnan
 */
public class SunONETransactionManagerLookup extends JNDITransactionManagerLookup {

	protected String getName() {
		return "java:pm/TransactionManager";
	}

	public String getUserTransactionName() {
		return "java:comp/UserTransaction";
	}
	
}
