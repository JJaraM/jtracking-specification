/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.specification;

/**
 * Interface for generic User representation. The User interface represent the
 * user that will be logged into the system.
 * <p>
 * 
 * To log into the system the user need to have a valid email address or a valid
 * username.
 * <p>
 * 
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 *
 */
public interface User extends SingularId {

	/**
	 * Gets the user's username
	 * <p>
	 * 
	 * @return {@link String} instance representing user's username
	 */
	String getUserName();

	/**
	 * Sets the user's username
	 * <p>
	 * 
	 * @param userName
	 *            {@link String} instance representing user's username
	 */
	void setUserName(String userName);

	/**
	 * Gets the user's email
	 * 
	 * @return {@link String} instance representing user's email
	 */
	String getEmail();

	/**
	 * Sets the user's email
	 * <p>
	 * 
	 * @param email
	 *            {@link String} instance representing user's email
	 */
	void setEmail(String email);

	/**
	 * Gets the user's password
	 * 
	 * @return {@link String} instance representing user's password
	 */
	String getPassword();

	/**
	 * Sets the user's password
	 * 
	 * @param password
	 *            {@link String} instance representing user's password
	 */
	void setPassword(String password);

	/**
	 * Gets the user's name
	 * 
	 * @return {@link String} instance representing user's name
	 */
	String getName();

	/**
	 * Sets the user's name
	 * 
	 * @param name
	 *            {@link String} instance representing user's name
	 */
	void setName(String name);

	/**
	 * Gets the user's last name
	 * 
	 * @return {@link String} instance representing user's last name
	 */
	String getLastName();

	/**
	 * Sets the user's last name
	 * 
	 * @param lastName
	 *            {@link String} instance representing user's lastname
	 */
	void setLastName(String lastName);
}