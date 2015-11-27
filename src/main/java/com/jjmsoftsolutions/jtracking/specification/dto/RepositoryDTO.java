package com.jjmsoftsolutions.jtracking.specification.dto;

import com.jjmsoftsolutions.jtracking.specification.Repository;
import com.jjmsoftsolutions.jtracking.specification.builder.equals.RepositoryEqualsBuilder;
import com.jjmsoftsolutions.jtracking.specification.builder.hashCode.RepositoryHashCode;
import com.jjmsoftsolutions.jtracking.specification.enums.RepositoryType;

public class RepositoryDTO implements Repository {

	private Integer id;
	private String name;
	private RepositoryType type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RepositoryType getType() {
		return type;
	}

	public void setType(RepositoryType type) {
		this.type = type;
	}
	
	@Override
	public boolean equals(final Object obj) {
	    return RepositoryEqualsBuilder.getInstance().isEquals(this, obj);
	}
	
	@Override
	public int hashCode(){
	    return RepositoryHashCode.getInstance().hashCode(this);
	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

}