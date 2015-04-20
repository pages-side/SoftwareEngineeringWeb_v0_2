package com.business;

public class Member {

	private String cno;
	private String cname;
	private String phone;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * A string builder for developers use
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [cno=");
		builder.append(cno);
		builder.append(", cname=");
		builder.append(cname);
		builder.append(", phone=");
		builder.append(phone);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the cno
	 */
	public String getCno() {
		return cno;
	}

	/**
	 * @param cno the cno to set
	 */
	public void setCno(String cno) {
		this.cno = cno;
	}

	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
