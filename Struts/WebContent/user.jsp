<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User</title>
</head>
<body>
<form action="admin/user_save.action" method="post" id="f1">
uid:<input type="text" name="uid" id="uid" value="${uid}"><br/>
username:<input type="text" name="username" id="username" value="${username}"><br/>
password:<input type="password" name="password" id="password" value="${password}"><br/>
<input type="submit" value="提交">
</form>
<a href="admin/user_getAll.action">查询用户信息</a><br/>

</body>
</html>