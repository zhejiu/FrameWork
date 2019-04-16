package com.wsj.struts2.ognl;
/**
 * @author   王施鉴
 * @version  创建时间: 2019年4月3日 下午9:49:50
  *  类说明
*/
public class User {
	private String username;
	private String password;
	private String address;
	
	
	public User() {
		super();
	}

	public User(String username, String password, String address) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", address=" + address + "]";
	}

}
