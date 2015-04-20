package com.commands;

import java.util.ArrayList;

import com.beans.LandingPageBean;
import com.command.parameters.CommandParameter;
import com.commands.LandingPageCommand;
import com.dataaccess.insert.InsertCurrentCustomer;

/**
 * This Class adds employees to the database (using DbAccessor and DbConn)
 *
 */
public class AddEmployeeCommand {
	private String errorMessage = "";
	private String eno;
	private String ename;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String ssno;
	private String hdate;
	private String manager;
	private LandingPageBean results = new LandingPageBean();
	private String forwardingPage = null;
	
	
	/**This method adds employee to the database
	 * @return a variable that tells the program its ok to move on
	 */
	public boolean execute(){
		boolean isSuccess = false;
		AddEmployeeCommand da = new AddEmployeeCommand();
		da.setEno(this.eno);
		da.setEname(this.ename);
		da.setStreet(this.street);
		da.setCity(this.city);
		da.setState(this.state);
		da.setZip(this.zip);
		da.setPhone(this.phone);
		da.setSsno(this.ssno);
		da.setHdate(this.hdate);
		da.setManager(this.manager);
		if(!da.execute()){
			this.errorMessage = "Unable to insert employee";
		}else{
			isSuccess = true;
		}
		LandingPageCommand cmd = new LandingPageCommand();
		if(!cmd.execute()){
			this.errorMessage = this.errorMessage + "/n" + "Error loading landing page";
			forwardingPage = "errorPage";
		}else{
			results.setCurrentCustomerList(cmd.getCurrentCustomerList());
			results.setFinishedCustomerList(cmd.getFinishedCustomerList());
			forwardingPage = "addEmployeeConfirmation.jsp";
		}
		return isSuccess;
	}
	/**This method uses a for loop and the CommandParameter to get needed attributes from the database
	 * @param params
	 */
	public void setParameters(ArrayList<CommandParameter>params){
		if(params != null && !params.isEmpty()){
			for(int ii=0; ii< params.size(); ii++){
				if("employeeNo".equals(params.get(ii).getName())){
					this.eno = params.get(ii).getValue();
				}
				if("employeeName".equals(params.get(ii).getName())){
					this.ename = params.get(ii).getValue();
				}
				if("address".equals(params.get(ii).getName())){
					this.street = params.get(ii).getValue();
				}
				if("address".equals(params.get(ii).getName())){
					this.street = params.get(ii).getValue();
				}	
				if("city".equals(params.get(ii).getName())){
					this.city = params.get(ii).getValue();
				}	
				if("state".equals(params.get(ii).getName())){
					this.state = params.get(ii).getValue();
				}	
				if("zip".equals(params.get(ii).getName())){
					this.zip = params.get(ii).getValue();
				}	
				if("ssno".equals(params.get(ii).getName())){
					this.ssno = params.get(ii).getValue();
				}	
				if("hdate".equals(params.get(ii).getName())){
					this.hdate = params.get(ii).getValue();
				}
			}
		}
	}
	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
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
	/**
	 * @return the results
	 */
	public LandingPageBean getResults() {
		return results;
	}
	/**
	 * @param results the results to set
	 */
	public void setResults(LandingPageBean results) {
		this.results = results;
	}
	/**
	 * @return the forwardingPage
	 */
	public String getForwardingPage() {
		return forwardingPage;
	}
	/**
	 * @param forwardingPage the forwardingPage to set
	 */
	public void setForwardingPage(String forwardingPage) {
		this.forwardingPage = forwardingPage;
	}
	/**
	 * @return the manager
	 */
	public String getManager() {
		return manager;
	}
	/**
	 * @param manager the manager to set
	 */
	public void setManager(String manager) {
		this.manager = manager;
	}
	
}
