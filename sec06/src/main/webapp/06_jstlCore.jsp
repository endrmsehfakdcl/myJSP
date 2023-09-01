<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 예제</title>
</head>
<body>
	<c:set var="msg" value="Hello"></c:set>
	\${msg } = ${msg }
	<br>
	<c:set var="age" value="30"></c:set>
	\${age } = ${age }
	<br>
	<c:set var="member" value="<%=new com.keduit.MemberBean()%>"></c:set>
	<c:set target="${member }" property="name" value="한정교"></c:set>
	<c:set target="${member }" property="userId" value="keduit"></c:set>
	\${member} = ${ member}
	<hr>
	<c:set var="add" value="${10+5 }"></c:set>
	<c:set var="flag" value="${10>5 }"></c:set>
	\${add } = ${add }
	<br> \${flag } = ${flag }
</body>
</html>