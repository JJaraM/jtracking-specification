package com.jjmsoftsolutions.jtracking.specification;

public interface Account extends SingularId {
	String getName();
	void setName(String name);
	
	String getToken();
	void setToken(String token);
}
