package com.commands;

import java.util.ArrayList;

import com.beans.LandingPageBean;
import com.command.parameters.CommandParameter;
import com.commands.LandingPageCommand;
import com.dataaccess.insert.InsertCurrentCustomer;

/**
 * This class allows a manager to add a game to the database
 *
 */
public class AddGameCommand {
	private String errorMessage = "";
	private String pno;
	private String name;
	private String platform;
	private LandingPageBean results = new LandingPageBean();
	private String forwardingPage = null;
	
	
	/**This method commits a game to the database
	 * @return a value telling the program its ok to move on
	 */
	public boolean execute(){
		boolean isSuccess = false;
		AddGameCommand da = new AddGameCommand();
		da.setPno(this.pno);
		da.setName(this.name);
		da.setPlatform(this.platform);
		if(!da.execute()){
			this.errorMessage = "Unable to add game";
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
			forwardingPage = "addGameConfirmation.jsp";
		}
		return isSuccess;
	}
	/**This method uses a for loop and the CommandParameter to get needed attributes from the database
	 * @param params
	 */
	public void setParameters(ArrayList<CommandParameter>params){
		if(params != null && !params.isEmpty()){
			for(int ii=0; ii< params.size(); ii++){
				if("PRODUCT_NO".equals(params.get(ii).getName())){
					this.pno = params.get(ii).getValue();
				}
				if("PRODUCT_NAME".equals(params.get(ii).getName())){
					this.name = params.get(ii).getValue();
				}
				if("PLATFORM".equals(params.get(ii).getName())){
					this.platform = params.get(ii).getValue();
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
	 * @return the pno
	 */
	public String getPno() {
		return pno;
	}
	/**
	 * @param pno the pno to set
	 */
	public void setPno(String pno) {
		this.pno = pno;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the platform
	 */
	public String getPlatform() {
		return platform;
	}
	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
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
	
	
	
	
}
