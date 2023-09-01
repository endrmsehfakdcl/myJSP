<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlFmt</title>
</head>
<body>
	<c:set var="now" value="<%=new java.util.Date()%>"></c:set>
	\${now }= ${now };
	<br>
	<fmt:formatDate value="${now }" />
	<br>
	date:
	<fmt:formatDate value="${now }" type="date" />
	<br>
	date:
	<fmt:formatDate value="${now }" type="time" />
	<br>
	date:
	<fmt:formatDate value="${now }" type="both" />
	<br>
	default:
	<fmt:formatDate value="${now }" type="both" dateStyle="default" />
	<br>
	long:
	<fmt:formatDate value="${now }" type="both" dateStyle="long" />
	<br>
	medium:
	<fmt:formatDate value="${now }" type="both" dateStyle="medium" />
	<br>
	short:
	<fmt:formatDate value="${now }" type="both" dateStyle="short" />
	<br>
	pattern= "yyyy년 MM월 dd일 hh시 mm분 ss초" :
	<fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" />
	<br>

</body>
</html>