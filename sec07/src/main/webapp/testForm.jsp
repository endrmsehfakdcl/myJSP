<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>상품 입력</h3>
	<form action="testAdd.jsp" method="post" name="test" id="test">
		<label for="item">상품명</label>
		<input type="text" id="item" name="item">
		<br>
		<label for="price">가격</label>
		<input type="text" id="price" name="price">
		<br>
		<label for="desc">상품설명</label>
		<br>
		<textarea rows="10" cols="50" name="desc" id="desc"></textarea>
		<br>
		<input type="submit" value="등록">
	</form>

</body>
</html>