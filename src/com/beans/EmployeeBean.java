package com.beans;

import java.util.ArrayList;

import com.business.Customer;
import com.business.Employee;
import com.business.Member;

/**
 * This returns an array list of al employees who meet a query
 *
 */
public class EmployeeBean {
	ArrayList<Employee> employeeList = null;
	public EmployeeBean(){
		
	}
	
	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	
	
	
}
