package com.wsj.struts2.app;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

/**
 * @author   王施鉴
 * @version  创建时间: 2019年4月10日 下午9:48:23
  *  雇员
*/
public class Employee implements RequestAware{
	Map<String, Object> requestMap = null;
	
	Dao dao = new Dao();
	
	private String name;
	private String password;
	private String gender;
	private String dept;
	private List<String> roles;
	private String desc;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String input() {
		requestMap.put("roles", dao.getRoles());
		requestMap.put("depts", dao.getDepts());
		return "input";
	}
	
	public String save() {
		return "save";
	}
	public void setRequest(Map<String, Object> request) {
		this.requestMap = request;
	}

}
