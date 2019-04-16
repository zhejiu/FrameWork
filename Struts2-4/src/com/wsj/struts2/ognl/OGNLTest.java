package com.wsj.struts2.ognl;

import com.opensymphony.xwork2.ActionContext;

/**
 * @author   王施鉴
 * @version  创建时间: 2019年4月3日 下午9:48:18
 * OGNL 练习
*/
public class OGNLTest {
	// 向值栈中放入user、user1对象
	User user = new User();
	User user1 = new User();

	public User getUser() {
		return user;
	}
	public User getUser1() {
		return user1;
	}
	
	public String execute() {
		user.setUsername("名字");
		user.setPassword("123456");
		user.setAddress("北京");
		
		user1.setUsername("小明");
		user1.setPassword("qwe123");
		user1.setAddress("上海");
		
		OGNLTest test = new OGNLTest();
		test.user.setAddress("山东");
		test.user.setPassword("qqqqqq");
		test.user.setUsername("花花");
		
		ActionContext.getContext().getValueStack().push(test);
		return "success";
	}
}
