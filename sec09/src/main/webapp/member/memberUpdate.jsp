<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정 폼</title>
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>
	<h3>회원 정보 수정</h3>
	<form name="frm" id="reg_frm" action="memberUpdate.do" method="post">
		<label for="name">이름</label>
		<span style="color: red;"> * </span>
		<input type="text" id="name" name="name" value="${mVO.name }" required>
		<br>
		<label for="id"> 아이디 </label>
		<span style="color: red;"> * </span>
		<input type="text" id="id" name="userid" value="${mVO.userid }" size="20" readonly>
		<br>
		<label for="pwd"> 비밀번호 </label>
		<span style="color: red;"> * </span>
		<input type="password" id="pwd" name="pwd" value="${mVO.pwd }" required>
		<br>
		<label for="email"> 이메일 </label>
		<span style="color: red;"> * </span>
		<input type="email" id="email" name="email" value="${mVO.email }" required>
		<br>
		<label for="phone"> 전화번호 </label>
		<span style="color: red;"> * </span>
		<input type="tel" id="phone" name="phone" value="${mVO.phone }" required>
		<br>
		<label for="admin"> 권한 </label>
		<span style="color: red;"> * </span>

		<c:choose>
			<c:when test="${mVO.admin==0 }">
				<input type="radio" name="admin" value="0" checked> 일반회원
				<input type="radio" name="admin" value="1"> 관리자
			</c:when>
			<c:otherwise>
				<input type="radio" name="admin" value="0">	일반회원
				<input type="radio" name="admin" value="1" checked>	관리자
			</c:otherwise>
		</c:choose>

		<br>
		<input type="submit" value="등록" onclick="return joinCheck()">
		<input type="reset" value="취소">
	</form>
	<p>${message }</p>
</body>
</html>