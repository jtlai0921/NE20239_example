//$Id: LtExpression.java,v 1.7 2004/06/04 05:43:46 steveebersole Exp $
package net.sf.hibernate.expression;

/**
 * @author Gavin King
 */
public class LtExpression extends SimpleExpression {
		
	LtExpression(String propertyName, Object value) {
		super(propertyName, value);
	}

	/**
	 * @see net.sf.hibernate.expression.SimpleExpression#getOp()
	 */
	String getOp() {
		return "<";
	}

}
