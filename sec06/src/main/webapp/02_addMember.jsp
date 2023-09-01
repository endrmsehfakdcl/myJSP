<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="member" class="com.keduit.MemberBean" />
<jsp:setProperty property="*" name="member" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member test</title>
</head>
<body>
	<h2>회원 정보</h2>
	이름 :
	<jsp:getProperty property="name" name="member" />
	<br> 아이디 :
	<jsp:getProperty property="userId" name="member" />
	<br> 비밀번호 :
	<jsp:getProperty property="pwd" name="member" />
	<br> 닉네임 :
	<jsp:getProperty property="nickname" name="member" />
	<br>
</body>
</html>