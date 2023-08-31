<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
pageContext.setAttribute("name", "page man", PageContext.PAGE_SCOPE);
request.setAttribute("name", "request man");
session.setAttribute("name", "session man");
application.setAttribute("name", "application man");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
firstPage.jsp: <br>
하나의 페이지 속성 : <%=pageContext.getAttribute("name") %>
하나의 요청 속성 : <%=request.getAttribute("name") %>
하나의 세션 속성 : <%=session.getAttribute("name") %>
하나의 애플리케이션 속성 : <%=application.getAttribute("name") %>
<% request.getRequestDispatcher("08_secondPage.jsp").forward(request, response); %>

</body>
</html>