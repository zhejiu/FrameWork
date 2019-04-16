package com.wsj.struts2.app;
/**
 * @author   王施鉴
 * @version  创建时间: 2019年4月10日 下午9:56:12
  *  
*/

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Dao {
	private static Map<Integer, Employee> emps = new LinkedHashMap<Integer, Employee>();
	
	static {
		emps.put(1001, new Employee(1001, "AA", "aa", "北京"));
		emps.put(1002, new Employee(1002, "BB", "bb", "上海"));
		emps.put(1003, new Employee(1003, "CC", "cc", "广州"));
		emps.put(1004, new Employee(1004, "DD", "dd", "深圳"));
		emps.put(1005, new Employee(1005, "EE", "ee", "杭州"));
	}
	
	public List<Employee> getEmployees(){
		return new ArrayList<Employee>(emps.values());
	}
	
	public Employee get(Integer employeeID) {
		return emps.get(employeeID);
	}
	
	public void add(Employee employee) {
		long currentTimeMillis = System.currentTimeMillis();
		employee.setEmployeeID((int) currentTimeMillis);
		emps.put(employee.getEmployeeID(), employee);
	}
	
	public void delete(Integer employeeID) {
		emps.remove(employeeID);
	}
	
	public void update(Employee employee) {
		emps.put(employee.getEmployeeID(), employee);
	}
}
