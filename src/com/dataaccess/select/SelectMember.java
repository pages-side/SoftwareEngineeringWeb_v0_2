package com.dataaccess.select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.business.Company;
import com.business.Member;
import com.dataaccess.DbAccessor;

/**
 * This class uses dbAccessor and DbConn to return objects of every member in the database.
 *
 */
public class SelectMember extends DbAccessor {
	ArrayList<Member> memberList = new ArrayList<Member>();
	public SelectMember(){	}
	
	/**Sends the query to DbAccessor.
	 * @param query
	 */
	public SelectMember(String query){
		super.setQuery(query);
	}
	
	/* (non-Javadoc)
	 * @see com.dataaccess.DbAccessor#execute()
	 * Tells DbAccessor to execute the query.
	 */
	@Override
	public boolean execute(){
		return super.execute();
	}
	
	/* (non-Javadoc)
	 * @see com.dataaccess.DbAccessor#processResult(java.sql.ResultSet)
	 * Turns every member record in the database into an object and adds them to memberList
	 */
	public boolean processResult(ResultSet rs) throws SQLException{
		boolean isSuccess = false;
		while(rs.next()){
			Member member = new Member();
			member.setCno(rs.getString("customerNo"));
			member.setCname(rs.getString("customerName"));
			member.setPhone(rs.getString("phone"));
			memberList.add(member);
			isSuccess = true;
		}
		return isSuccess;
	}

	public ArrayList<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(ArrayList<Member> memberList) {
		this.memberList = memberList;
	}
	
}
