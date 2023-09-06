<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>바로 보내기</title>
</head>
<body>
	<%
	response.sendRedirect("http://localhost:8088/sec11/BoardServlet?command=board_list");
	%>
</body>
</html>