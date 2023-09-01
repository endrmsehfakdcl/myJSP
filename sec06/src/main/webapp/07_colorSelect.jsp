<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String[] movieList = { "타이타닉", "노트북", "라라랜드", "헤어질 결심", "가위손" };
pageContext.setAttribute("movieList", movieList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${param.color == 1 }">
		<h1 style="color: red">빨강</h1>
	</c:if>
	<c:if test="${param.color == 2 }">
		<h1 style="color: yellow">노랑</h1>
	</c:if>
	<c:if test="${param.color == 3 }">
		<h1 style="color: green">초록</h1>
	</c:if>

	<c:choose>
		<c:when test="${param.fruit == 1 }">
			<h1 style="color: red">사과</h1>
		</c:when>
		<c:when test="${param.fruit == 2 }">
			<h1 style="color: yellow">망고</h1>
		</c:when>
		<c:when test="${param.fruit == 3 }">
			<h1 style="color: green">멜론</h1>
		</c:when>
	</c:choose>

	<c:forEach var="item" items="${paramValues.item }" varStatus="status">
		${item } <c:if test="${not status.last }">,</c:if>
	</c:forEach>
	<br>

	<c:forEach var="movie" items="${movieList }" varStatus="status">
		${status.index }
		${status.count }
		${movie }
		<br>
	</c:forEach>
</body>
</html>