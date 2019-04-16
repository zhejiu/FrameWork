package com.wsj.struts2.app;
/**
 * @author   王施鉴
 * @version  创建时间: 2019年4月10日 下午9:45:44
  *  部门
*/
public class Dept {
	private int deptId;
	private String deptName;
	
	public Dept() {
		super();
	}
	
	public Dept(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}
