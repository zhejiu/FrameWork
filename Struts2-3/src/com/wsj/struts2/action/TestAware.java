package com.wsj.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

/**
 * @author   王施鉴
 * @version  创建时间: 2019年3月29日 下午5:13:16
  *  类说明
*/
public class TestAware implements ApplicationAware,SessionAware,RequestAware,ParameterAware{
	Map<String, Object> application = null;
	Map<String, Object> session = null;
	Map<String, Object> request = null;
	Map<String, String[]> parameters = null;
	
	public String execute() {
		application.put("application", "applicationvalue");	
		session.put("session", "sessionvalue");
		request.put("request", "requestvalue");
		parameters.put("age", new String[] {"100"});
		
		return "success";
	}
	
	public void setParameters(Map<String, String[]> map) {
		// TODO Auto-generated method stub
		this.parameters = map;
	}

	public void setRequest(Map<String, Object> map) {
		// TODO Auto-generated method stub
		this.request = map;
	}

	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		this.session = map;
	}

	public void setApplication(Map<String, Object> map) {
		// TODO Auto-generated method stub
		this.application = map;
	}

}
