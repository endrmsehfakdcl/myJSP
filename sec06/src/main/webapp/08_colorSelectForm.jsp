<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="07_colorSelect.jsp">
		<label for="color">색상을 선택하세요.</label>
		<br>
		<select id="color" name="color">
			<option value="1">빨강</option>
			<option value="2">노랑</option>
			<option value="3">초록</option>
		</select>
		<br>
		<br>
		<label for="fruit">과일을 선택하세요.</label>
		<br>
		<select id="fruit" name="fruit">
			<option value="1">사과</option>
			<option value="2">메론</option>
			<option value="3">망고</option>
		</select>
		<br>
		<br>
		<input type="checkbox" name="item" value="신발">
		신발
		<input type="checkbox" name="item" value="가방">
		가방
		<input type="checkbox" name="item" value="벨트">
		벨트
		<br>
		<input type="checkbox" name="item" value="모자">
		모자
		<input type="checkbox" name="item" value="시계">
		시계
		<input type="checkbox" name="item" value="쥬얼리">
		쥬얼리
		<br>
		<br>

		<input type="submit" value="전송">
	</form>
</body>
</html>