<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션의 메소드 활용하기</title>
</head>
<body>
	<%
	String id_str = session.getId();
	long lasttime = session.getLastAccessedTime();
	long createtime = session.getCreationTime();
	long time_used = (lasttime - createtime) / 60000;
	int inactive = session.getMaxInactiveInterval() / 60;
	boolean b_new = session.isNew();
	%>
	
	(1)세션 ID는 [<%=id_str %>]<br>
	(2)세션의 마지막 access 타임 [<%=lasttime %>]<br>
	(3)당신이 웹 사이트에 머문 시간은 <%=time_used %>입니다.<br>
	(4)세션의 유효시간은 <%=inactive %>입니다.<br>
	(5)세션이 새로 만들어졌나요? <%=b_new %><br>
	
</body>
</html>