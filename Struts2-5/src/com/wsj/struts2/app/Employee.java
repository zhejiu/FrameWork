package com.wsj.struts2.app;

/**
 * @author   王施鉴
 * @version  创建时间: 2019年4月10日 下午9:48:23
  *  雇员
*/
public class Employee{
	private Integer employeeID;
	private String firstName;
	private String lastName;
	private String address;
	
	public Employee() {
		super();
	}

	public Employee(Integer employeeID, String firstName, String lastName, String address) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
