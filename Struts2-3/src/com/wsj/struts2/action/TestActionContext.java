package com.wsj.struts2.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

/**
 * @author   王施鉴
 * @version  创建时间: 2019年3月29日 下午3:53:02
  * 通过ActionContext获取Web资源
*/
public class TestActionContext {
	public String execute() {
		// 获取应用上下文
		ActionContext actionContext = ActionContext.getContext();
		
		// application作用域
		Map<String, Object> application = actionContext.getApplication();
		application.put("application", "applicationvalue");		
		
		// session作用域
		Map<String, Object> session = actionContext.getSession();
		session.put("session", "sessionvalue");
		
		// request作用域，与其他的不一样
		Map<String, Object> request = (Map<String, Object>) actionContext.get("request");
		request.put("request", "requestvalue");
		
		// parameters 这个 Map 只能读, 不能写入数据, 如果写入, 但不出错, 但也不起作用!
		Map<String, Object> parameters = actionContext.getParameters();
		parameters.put("age", "100");
		
		return "success";
	}
}
