<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts Demo</title>
</head>
<body>

<form action="login" method="post">
<p>
username:<input type="text" id="username" name="username" value=""><br/>
password:<input type="text" id="password" name="password" value=""><br/>
<input type="submit">
</p>
</form>
<p>登陆成功：${username}${password}</p>
<p>
<s:property value="#session.username"/><br/>
<s:property value="#application.password"/>
</p>
</body>
</html>