package com.jjmsoftsolutions.jtracking.specification.builder.hashCode;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.jjmsoftsolutions.jtracking.specification.Repository;
import com.jjmsoftsolutions.jtracking.specification.builder.ObjectHashCodeBuilder;

public class RepositoryHashCode implements ObjectHashCodeBuilder<Repository> {
	
	private static RepositoryHashCode instance = null;
	
	private RepositoryHashCode() {}
	
	public static RepositoryHashCode getInstance() {
		if (instance == null) {
			instance = new RepositoryHashCode();
		}
		return instance;
	}

	@Override
	public int hashCode(Repository object) {
		return new HashCodeBuilder().append(object.getName()).append(object.getType()).toHashCode();
	}

}
