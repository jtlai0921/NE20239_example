package com.redsaga.hibernatesample.step4.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.redsaga.hibernatesample.step4.dao.BoardDAO;

/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseBoardDAO extends com.redsaga.hibernatesample.step4.dao._RootDAO {

	public static BoardDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static BoardDAO getInstance () {
		if (null == instance) instance = new BoardDAO();
		return instance;
	}

	/**
	 * com.redsaga.hibernatesample.step4.dao._RootDAO _RootDAO.getReferenceClass()
	 */
	public Class getReferenceClass () {
		return com.redsaga.hibernatesample.step4.Board.class;
	}
	
	public com.redsaga.hibernatesample.step4.Board load(java.lang.Integer key)
		throws org.hibernate.HibernateException {
		return (com.redsaga.hibernatesample.step4.Board) load(getReferenceClass(), key);
	}

	public com.redsaga.hibernatesample.step4.Board load(java.lang.Integer key, Session s)
		throws org.hibernate.HibernateException {
		return (com.redsaga.hibernatesample.step4.Board) load(getReferenceClass(), key, s);
	}

	public com.redsaga.hibernatesample.step4.Board loadInitialize(java.lang.Integer key, Session s)
			throws org.hibernate.HibernateException {
		com.redsaga.hibernatesample.step4.Board obj = load(key, s);
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param board a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Integer save(com.redsaga.hibernatesample.step4.Board board)
		throws org.hibernate.HibernateException {
		return (java.lang.Integer) super.save(board);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param board a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.Integer save(com.redsaga.hibernatesample.step4.Board board, Session s)
		throws org.hibernate.HibernateException {
		return (java.lang.Integer) super.save(board, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param board a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.redsaga.hibernatesample.step4.Board board)
		throws org.hibernate.HibernateException {
		super.saveOrUpdate(board);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param board a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.redsaga.hibernatesample.step4.Board board, Session s)
		throws org.hibernate.HibernateException {
		super.saveOrUpdate(board, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param board a transient instance containing updated state
	 */
	public void update(com.redsaga.hibernatesample.step4.Board board)
		throws org.hibernate.HibernateException {
		super.update(board);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param board a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.redsaga.hibernatesample.step4.Board board, Session s)
		throws org.hibernate.HibernateException {
		super.update(board, s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.Integer id)
		throws org.hibernate.HibernateException {
		super.delete(load(id));
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param id the instance ID to be removed
	 * @param s the Session
	 */
	public void delete(java.lang.Integer id, Session s)
		throws org.hibernate.HibernateException {
		super.delete(load(id, s), s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param board the instance to be removed
	 */
	public void delete(com.redsaga.hibernatesample.step4.Board board)
		throws org.hibernate.HibernateException {
		super.delete(board);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param board the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.redsaga.hibernatesample.step4.Board board, Session s)
		throws org.hibernate.HibernateException {
		super.delete(board, s);
	}
	
	/**
	 * Re-read the state of the given instance from the underlying database. It is inadvisable to use this to implement
	 * long-running sessions that span many business tasks. This method is, however, useful in certain special circumstances.
	 * For example 
	 * <ul> 
	 * <li>where a database trigger alters the object state upon insert or update</li>
	 * <li>after executing direct SQL (eg. a mass update) in the same session</li>
	 * <li>after inserting a Blob or Clob</li>
	 * </ul>
	 */
	public void refresh (com.redsaga.hibernatesample.step4.Board board, Session s)
		throws org.hibernate.HibernateException {
		super.refresh(board, s);
	}

    public String getDefaultOrderProperty () {
		return "name";
    }

}