package com.wsj.struts2.action;
/**
 * @author   王施鉴
 * @version  创建时间: 2019年3月29日 下午9:54:32
  *  类说明
*/
public class User {
	private String userName;
	private int count;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public User() {
		super();
	}

	public User(String userName) {
		super();
		this.userName = userName;
	}	
}
