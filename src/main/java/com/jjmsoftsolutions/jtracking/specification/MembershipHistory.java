package com.jjmsoftsolutions.jtracking.specification;

import java.util.Date;

public interface MembershipHistory {
	
	Membership getMembership();
	void setMembership(Membership membership);

	String getMessage();
	void setMessage(String message);
	
	Date getDate();
	void setDate(Date date);
	
}