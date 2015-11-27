/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.specification;

import java.util.Set;

/**
 * Interface for generic <code>Account</code> representation. The
 * <code>Account</code> interface represents the all information related to the user's account
 * 
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 * @see SingularId
 */
public interface Account extends SingularId {

	/**
	 * Gets the account's user
	 * 
	 * @return {@link User} instance representing account's user
	 */
	User getUser();

	/**
	 * Sets the account's user
	 * 
	 * @param name
	 *            {@link User} instance representing account's token
	 */
	void setUser(User user);

	/**
	 * Gets the account's token
	 * 
	 * @return {@link String} instance representing account's token
	 */
	String getToken();

	/**
	 * Sets the account's token
	 * 
	 * @param name
	 *            {@link String} instance representing account's token
	 */
	void setToken(String token);

	/**
	 * Gets the account's membership
	 * 
	 * @return {@link Membership} instance representing account's membership
	 */
	Set<Membership> getMembership();

	/**
	 * Sets the account's users
	 * 
	 * @param name
	 *            {@link Membership} instance representing account's membership
	 */
	void setMembership(Set<Membership> memberships);

	/**
	 * Add a new membership
	 * 
	 * @param membership
	 *            {@link Membership}
	 * @return {@link Membership} instance representing the new account's
	 *         membership
	 */
	Membership addMembership(Membership membership);

	/**
	 * Remove an existed membership
	 * 
	 * @param membership
	 *            {@link Membership}
	 * @return {@link Membership} instance representing the removed account's
	 *         membership
	 */
	Membership removeMembership(Membership membership);

}