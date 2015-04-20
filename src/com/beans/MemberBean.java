package com.beans;

import java.util.ArrayList;

import com.business.Customer;
import com.business.Member;

public class MemberBean {
	ArrayList<Member> memberList = null;
	/**
	 * This returns an array list of all members who meet a query
	 */
	public MemberBean(){
		
	}
	public ArrayList<Member> getCustomerList() {
		return memberList;
	}
	public void setCustomerList(ArrayList<Member> memberList) {
		this.memberList = memberList;
	}

	
	
	
}
