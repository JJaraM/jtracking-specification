/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.specification;

/**
 * Interface for generic Id representation. The Id interface represent the
 * primary key of the objects
 * <p>
 * 
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 *
 */
public interface SingularId {

	/**
	 * Gets the id of the object
	 * 
	 * @return {@link Integer} instance representing the id
	 */
	Integer getId();

	/**
	 * Sets the id of the object
	 * 
	 * @param id
	 *            {@link Integer} instance representing the id
	 */
	void setId(Integer id);
}
