package com.jjmsoftsolutions.jtracking.specification.builder.equals;

import org.apache.commons.lang3.builder.EqualsBuilder;

import com.jjmsoftsolutions.jtracking.specification.Repository;
import com.jjmsoftsolutions.jtracking.specification.builder.ObjectEqualsBuilder;

public class RepositoryEqualsBuilder implements ObjectEqualsBuilder<Repository> {

	private static RepositoryEqualsBuilder instance = null;
	
	private RepositoryEqualsBuilder() {}
	
	public static RepositoryEqualsBuilder getInstance() {
		if (instance == null) {
			instance = new RepositoryEqualsBuilder();
		}
		return instance;
	}

	@Override
	public boolean isEquals(Repository obj1, Object obj2) {
		boolean isEquals = false;
	    if (obj2 instanceof Repository) {
	        final Repository repository = (Repository) obj2;
	        isEquals = new EqualsBuilder().append(obj1.getName(), repository.getName()).
	        		append(obj1.getType(), repository.getType()).isEquals();
	    }
		return isEquals;
	}
}