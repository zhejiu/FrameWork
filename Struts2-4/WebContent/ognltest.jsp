<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:debug></s:debug>
	
	<!-- -------------------  通过对象方式获取值栈数据   ------------------------- -->
	通过对象方式获取值栈数据 <br><br>
	name:<s:property value="user.username"/><br>
	password:<s:property value="user.password"/><br>
	address:<s:property value="user.address"/><br>
	<br><br>
	
	name1:<s:property value="user1.username"/><br>
	password1:<s:property value="user1.password"/><br>
	address1:<s:property value="user1.address"/><br>
	<br><br><br><br>
	
	<!-- -------------------  通过list方式获取值栈数据   ------------------------- -->
	通过list方式获取值栈数据<br><br>
	name:<s:property value="[1].user1.username"/><br>
	password:<s:property value="[1].user1.password"/><br>
	address:<s:property value="[1].user1.address"/><br>
	<br><br>
	
	name1:<s:property value="[0].username"/><br>
	password1:<s:property value="[0].password"/><br>
	address1:<s:property value="[0].address"/><br>
	<br><br><br><br>
	
	<!-- -------------------  通过list的迭代器方式获取值栈数据   ------------------------- -->
	通过list的迭代器方式获取值栈数据<br><br>
	<s:iterator value="list">
		<s:property value="username"/>
		<s:property value="password"/>
		<s:property value="address"/>
	</s:iterator>
	<br><br><br><br>
	
	<s:form >
		
	</s:form>
	
</body>
</html>