package com.wsj.struts2.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ModelDriven;

/**
 * @author   王施鉴
 * @version  创建时间: 2019年4月11日 下午10:55:49
  * 
*/
public class EmployeeAction implements RequestAware,ModelDriven<Employee>{

	Map<String, Object> requestMap = new HashMap<String, Object>();
	private Employee employee;
	
	Dao dao = new Dao();
	
	private Integer employeeID;

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String list() {
		List<Employee> employees = dao.getEmployees();
		requestMap.put("emps", employees);
		return "list";
	}
	
	public String delete() {
		dao.delete(employeeID);
		return "success";
	}
	
	public String save() {
		dao.add(employee);
		return "success";
	}
	
	public String edit() {
//		Employee emp = dao.get(employee.getEmployeeID());
//		
//		employee.setFirstName(emp.getFirstName());
//		employee.setLastName(emp.getLastName());
//		employee.setAddress(emp.getAddress());
		
		return "success";
	}

	public String update() {
		dao.update(employee);
		return "success";
	}
	
	@Override
	public Employee getModel() {
		if (employeeID == null) {
			employee = new Employee();			
		} else {
			employee = dao.get(employeeID);
		}
		return employee;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.requestMap = request;
	}
}
