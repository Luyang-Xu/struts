<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>欢迎登陆</title>
</head>
<body>
<s:form action="login" method="post">
<s:textfield label="username" name="username"></s:textfield>
<s:password label="password" name="password"></s:password>
<s:submit value="login"></s:submit>
</s:form>

</body>
</html>