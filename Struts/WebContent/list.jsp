<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人员列表展示</title>
</head>
<body>
	以下是人员信息：
	<br />
	<table>
		<tr>
			<td>uid</td>
			<td>username</td>
			<td>password</td>
		</tr>
		<c:forEach items="${list}" var="user">
			<tr>
				<td>${user.uid}</td>
				<td>${user.username}</td>
				<td>${user.password}</td>
			</tr>
		</c:forEach>

	</table>



</body>
</html>