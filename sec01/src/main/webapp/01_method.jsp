<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="MethodServlet" method="get">
		<input type="submit" value="get방식으로 호출함">
	</form>
	<br>
	<form action="MethodServlet" method="post">
		<input type="submit" value="post방식으로 호출함">
		<a href="MethodServlet">여기를 클릭</a>
	</form>
	<%@ include file="footer.jsp" %>

</body>
</html>