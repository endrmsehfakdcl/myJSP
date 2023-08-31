<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인확인</title>
</head>
<body>
	<%
	String id = "keduit";
	String pwd = "12345";
	String name = "한정교";

	request.setCharacterEncoding("UTF-8");
	if (id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd"))) {
		response.sendRedirect("03_main.jsp?name=" + URLEncoder.encode(name, "UTF-8"));
	} else {
		response.sendRedirect("01_loginForm.jsp");
	}
	%>
</body>
</html>