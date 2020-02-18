//$Id: Jay.java,v 1.4 2004/08/14 09:34:30 oneovthafew Exp $
package org.hibernate.test;

/**
 * @author Gavin King
 */
public class Jay {
	private long id;
	private Eye eye;
	/**
	 * @return Returns the eye.
	 */
	public Eye getEye() {
		return eye;
	}

	/**
	 * @param eye The eye to set.
	 */
	public void setEye(Eye eye) {
		this.eye = eye;
	}

	/**
	 * @return Returns the id.
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id The id to set.
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	public Jay() {}
	
	public Jay(Eye eye) {
		eye.getJays().add(this);
		this.eye = eye;
	}

}
