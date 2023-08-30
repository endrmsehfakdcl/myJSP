<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Addition</title>
</head>
<body>
	<h1>계산기</h1>
	<%
	int num1 = 100;
	int num2 = 500;
	int add = num1 + num2;
	%>
	
	<%= num1 %> + <%= num2 %> = <%= add %>
</body>
</html>