package com.wsj.struts2.app;
/**
 * @author   王施鉴
 * @version  创建时间: 2019年4月10日 下午9:43:49
  *  角色
*/
public class Role {
	private Integer roleId;
	private String roleName;
	
	public Role() {
		super();
	}
	
	public Role(Integer roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
