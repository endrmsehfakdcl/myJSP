<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>
	<form method="POST" action="login.do" name="frm">
		<input type="text" name="userid" id="userid" placeholder="아이디" required>
		<br>
		<input type="password" name="pwd" id="pwd" placeholder="비밀번호" required>
		<br>
		<input type="submit" value="로그인" onclick="return loginCheck()">
		&nbsp; &nbsp;
		<input type="reset" value="취소">
		<input type="button" value="회원가입" onclick="location.href='join.do'">
		<hr>
		<p>${message }</p>

	</form>
</body>
</html>