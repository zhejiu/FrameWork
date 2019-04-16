<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<s:form action="emp-save.action" method="post">
		<s:textfield name="name" label="姓名"></s:textfield>
		<s:password name="password" label="密码"></s:password>
		<s:radio name="gender" list="#{'1':'Male','0':'Female' }" label="性别"></s:radio>
		<s:select name="depts" list="#request.depts" listKey="deptId" listValue="deptName" label="部门"></s:select>
		<s:checkboxlist name="roles" list="#request.roles" listKey="roleName" listValue="roleName" label="角色"></s:checkboxlist>
		<s:textarea name="desc" label="描述"></s:textarea>
		<s:submit name="submit" value="提交" label=""></s:submit>
	</s:form>
</body>
</html>