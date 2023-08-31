<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>setSession</title>
</head>
<body>
<%
	session.setAttribute("id", "keduit");
	session.setAttribute("pwd", "12345");
	session.setAttribute("age", 29);
%>
</body>
</html>