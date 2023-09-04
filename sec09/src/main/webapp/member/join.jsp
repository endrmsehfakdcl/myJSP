<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 입력 폼</title>
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>
	<h3>회원 정보 입력</h3>
	<form name="frm" id="reg_frm" action="join.do" method="post">
		<label for="name">이름</label>
		<span style="color: red;"> * </span>
		<input type="text" id="name" name="name" required>
		<br>
		<label for="id"> 아이디 </label>
		<span style="color: red;"> * </span>
		<input type="text" id="id" name="userid" size="20" required>
		<input type="hidden" name="reid" size="20">
		<input type="button" value="중복체크" onclick="idCheck()">
		<br>
		<label for="pwd"> 비밀번호 </label>
		<span style="color: red;"> * </span>
		<input type="password" id="pwd" name="pwd" required>
		<br>
		<label for="pwd_check"> 비밀번호 확인 </label>
		<span style="color: red;"> * </span>
		<input type="password" id="pwd_check" name="pwd_check" required>
		<br>
		<label for="email"> 이메일 </label>
		<span style="color: red;"> * </span>
		<input type="email" id="email" name="email" required>
		<br>
		<label for="phone"> 전화번호 </label>
		<span style="color: red;"> * </span>
		<input type="tel" id="phone" name="phone" required>
		<br>
		<label for="admin"> 권한 </label>
		<span style="color: red;"> * </span>
		<input type="radio" name="admin" value="0">
		일반회원
		<input type="radio" name="admin" value="1">
		관리자<br>
		<input type="submit" value="등록" onclick="return joinCheck()">
		<input type="reset" value="취소">
	</form>
	<p>${message }</p>
</body>
</html>