<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		int code = Integer.parseInt(request.getParameter("code"));
		code++;
	%>
	
		<h1>Welcome...</h1> <%= id %> 님!!!
		your password is... <%= pass %>.
		<br>
		your code is... <%= code %>.
</body>
</html>