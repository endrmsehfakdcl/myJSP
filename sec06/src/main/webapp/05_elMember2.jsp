<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- param은 jsp:useBean이 없어도 된다. --%>
	이름 : ${param.name}
	<br> 아이디 : ${param.userId}
	<br> 비밀번호 : ${param.pwd}
	<br> 닉네임 : ${param.nickname}
	<br>
</body>
</html>