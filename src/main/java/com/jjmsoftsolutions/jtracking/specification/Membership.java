/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.specification;

import java.util.Set;
import com.jjmsoftsolutions.jtracking.specification.enums.MembershipType;

/**
 * Interface for generic <code>Membership</code> representation. The
 * <code>Membership</code>
 * 
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 * @see SingularId
 */
public interface Membership extends SingularId {

	/**
	 * Gets the membership's name
	 * 
	 * @return {@link String} instance representing membership's name
	 */
	String getName();

	/**
	 * Sets the membership's name
	 * 
	 * @param name
	 *            {@link String} instance representing membership's name
	 */
	void setName(String name);

	/**
	 * Gets the membership's account
	 * 
	 * @return {@link Account} instance representing membership's account
	 */
	Account getAccount();

	/**
	 * Sets the membership's account
	 * 
	 * @param name
	 *            {@link Account} instance representing membership's account
	 */
	void setAccount(Account account);

	/**
	 * Gets the membership's roles
	 * 
	 * @return {@link Role} instance representing membership's roles
	 */
	Set<Role> getRoles();

	/**
	 * Sets the membership's roles
	 * 
	 * @param name
	 *            {@link Role} instance representing membership's roles
	 */
	void setRoles(Set<Role> roles);

	/**
	 * Gets the membership's history
	 * 
	 * @return {@link MembershipHistory} instance representing membership's
	 *         history
	 */
	Set<MembershipHistory> getHistory();

	/**
	 * Sets the membership's history
	 * 
	 * @param name
	 *            {@link MembershipHistory} instance representing membership's
	 *            history
	 */
	void setHistory(Set<MembershipHistory> history);

	/**
	 * Gets the membership's active status. If the value is <code>TRUE</code>
	 * the membership is enabled, if the value is <code>false</code> the
	 * membership is disabled
	 * 
	 * @return {@link Boolean} instance representing membership's active status
	 */
	Boolean isActive();

	/**
	 * Sets the membership's active status. If the value is <code>TRUE</code>
	 * the membership is enabled, if the value is <code>false</code> the
	 * membership is disabled
	 * 
	 * @param name
	 *            {@link Boolean} instance representing membership's active
	 *            status
	 */
	void setActive(Boolean active);

	/**
	 * Gets the membership's token
	 * 
	 * @return {@link String} instance representing membership's token
	 */
	String getToken();

	/**
	 * Sets the membership's token
	 * 
	 * @param name
	 *            {@link String} instance representing membership's token
	 */
	void setToken(String token);

	/**
	 * Gets the membership's type
	 * 
	 * @return {@link MembershipType} instance representing membership's type
	 */
	MembershipType getType();

	/**
	 * Sets the membership's type
	 * 
	 * @param name
	 *            {@link MembershipType} instance representing membership's type
	 */
	void setType(MembershipType type);

	/**
	 * Add a new history record
	 * 
	 * @param record
	 *            {@link MembershipHistory} to be inserted
	 * @return {@link MembershipHistory} instance representing membership's
	 *         history
	 */
	MembershipHistory addHistoryRecord(MembershipHistory record);

	/**
	 * Remove the current history record
	 * 
	 * @param record
	 *            {@link MembershipHistory} to be removed
	 * @return {@link MembershipHistory} instance representing membership's
	 *         history
	 */
	MembershipHistory removeHistoryRecord(MembershipHistory record);

}