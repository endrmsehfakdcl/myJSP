<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int age = Integer.parseInt(request.getParameter("age"));
	if (age > 19) {
		request.setAttribute("name", "한정교");
		RequestDispatcher dispatcher = request.getRequestDispatcher("06_forwardResult.jsp");
		dispatcher.forward(request, response);
	} else {
	%>
	<script type="text/javascript">
		alert("19세 미만은 입장이 불가합니다.");
		history.go(-1);	
	</script>
	<%
	}
	%>

</body>
</html>