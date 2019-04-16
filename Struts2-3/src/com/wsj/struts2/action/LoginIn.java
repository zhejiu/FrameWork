package com.wsj.struts2.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

/**
 * @author   王施鉴
 * @version  创建时间: 2019年3月29日 下午9:42:59
  *
*/
public class LoginIn implements SessionAware,ApplicationAware{
	Map<String, Object> applicaiton = null;
	Map<String, Object> session = null;
	
	
	private String userName;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String execute() {
		return "success";
	}
	
	public String loginIn() {
		session.put("userName", userName);
		Integer count = (Integer)applicaiton.get("count");
		if (count == null) {
			count = 0;
		}
		count++;
		applicaiton.put("count", count);
		
		return "login-in";
	}
	
	public String loginOut() {
		((SessionMap<String, Object>)session).invalidate();
		Integer count = (Integer)applicaiton.get("count");
		if (count != null && count != 0) {
			count--;
		}
		applicaiton.put("count", count);
		return "login-out";
	}

	public void setApplication(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.applicaiton = arg0;
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = arg0;
	}

}
