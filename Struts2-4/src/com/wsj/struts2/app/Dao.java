package com.wsj.struts2.app;
/**
 * @author   王施鉴
 * @version  创建时间: 2019年4月10日 下午9:56:12
  *  
*/

import java.util.ArrayList;
import java.util.List;

public class Dao {
	public List<Role> getRoles(){
		List<Role> roles = new ArrayList<Role>();
		roles.add(new Role(111, "a雇员"));
		roles.add(new Role(222, "b雇员"));
		roles.add(new Role(333, "c雇员"));
		roles.add(new Role(444, "d雇员"));
		return roles;
	}
	
	public List<Dept> getDepts(){
		List<Dept> depts = new ArrayList<Dept>();
		depts.add(new Dept(1001, "A部门"));
		depts.add(new Dept(1002, "B部门"));
		depts.add(new Dept(1003, "C部门"));
		depts.add(new Dept(1004, "D部门"));
		return depts;
	}
	
	
}
