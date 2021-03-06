package com.redsaga.hibernatesample.step3.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an object that contains data related to the user table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="user"
 */
public abstract class BaseUser  implements Serializable {

	public static String PROP_PWD = "pwd";
	public static String PROP_NAME = "name";
	public static String PROP_ID = "id";


	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer _id;

	// fields
	private java.lang.String _name;
	private java.lang.String _pwd;

	// collections
	private java.util.Set _articles;
	private java.util.Set _boards;


	// constructors
	public BaseUser () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseUser (java.lang.Integer _id) {
		this.setId(_id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseUser (
		java.lang.Integer _id,
		java.lang.String _name,
		java.lang.String _pwd) {

		this.setId(_id);
		this.setName(_name);
		this.setPwd(_pwd);
		initialize();
	}

	protected void initialize () {}



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="increment"
     *  column="id"
     */
	public java.lang.Integer getId () {
		return _id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param _id the new ID
	 */
	public void setId (java.lang.Integer _id) {
		this._id = _id;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
	 * Return the value associated with the column: name
	 */
	public java.lang.String getName () {
		return _name;
	}

	/**
	 * Set the value related to the column: name
	 * @param _name the name value
	 */
	public void setName (java.lang.String _name) {
		this._name = _name;
	}


	/**
	 * Return the value associated with the column: pwd
	 */
	public java.lang.String getPwd () {
		return _pwd;
	}

	/**
	 * Set the value related to the column: pwd
	 * @param _pwd the pwd value
	 */
	public void setPwd (java.lang.String _pwd) {
		this._pwd = _pwd;
	}


	/**
	 * Return the value associated with the column: articles
	 */
	public java.util.Set getArticles () {
		return this._articles;
	}

	/**
	 * Set the value related to the column: articles
	 * @param _articles the articles value
	 */
	public void setArticles (java.util.Set _articles) {
		this._articles = _articles;
	}
	
	public void addToArticles (Object obj) {
		if (null == this._articles) this._articles = new java.util.HashSet();
		this._articles.add(obj);
	}



	/**
	 * Return the value associated with the column: boards
	 */
	public java.util.Set getBoards () {
		return this._boards;
	}

	/**
	 * Set the value related to the column: boards
	 * @param _boards the boards value
	 */
	public void setBoards (java.util.Set _boards) {
		this._boards = _boards;
	}
	
	public void addToBoards (Object obj) {
		if (null == this._boards) this._boards = new java.util.HashSet();
		this._boards.add(obj);
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.redsaga.hibernatesample.step3.base.BaseUser)) return false;
		else {
			com.redsaga.hibernatesample.step3.base.BaseUser mObj = (com.redsaga.hibernatesample.step3.base.BaseUser) obj;
			if (null == this.getId() || null == mObj.getId()) return false;
			else return (this.getId().equals(mObj.getId()));
		}
	}


	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}