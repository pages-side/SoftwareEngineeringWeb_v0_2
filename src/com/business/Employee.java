package com.business;

/**
 * Creates the employee object
 *
 */
public class Employee {

	private String eno;
	private String ename;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String ssno;
	private String hdate;
	
	
	/**
	 * @return the eno
	 */
	public String getEno() {
		return eno;
	}


	/**
	 * @param eno the eno to set
	 */
	public void setEno(String eno) {
		this.eno = eno;
	}


	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}


	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}


	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}


	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}


	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}


	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
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


	/**
	 * @return the ssno
	 */
	public String getSsno() {
		return ssno;
	}


	/**
	 * @param ssno the ssno to set
	 */
	public void setSsno(String ssno) {
		this.ssno = ssno;
	}


	/**
	 * @return the hdate
	 */
	public String getHdate() {
		return hdate;
	}


	/**
	 * @param hdate the hdate to set
	 */
	public void setHdate(String hdate) {
		this.hdate = hdate;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * A string builder for developers use
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [Employee ID=");
		builder.append(eno);
		builder.append(", Employee name=");
		builder.append(ename);
		builder.append(", street=");
		builder.append(street);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", zip=");
		builder.append(zip);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", social security number=");
		builder.append(ssno);
		builder.append(", hire date=");
		builder.append(hdate);
		builder.append("]");
		return builder.toString();
	}

}
