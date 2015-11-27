package com.jjmsoftsolutions.jtracking.specification;

import com.jjmsoftsolutions.jtracking.specification.enums.RepositoryType;

public interface Repository extends SingularId {
	
	String getName();
	void setName(String name);
	
	RepositoryType getType();
	void setType(RepositoryType type);

}
