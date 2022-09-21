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
		
		if(id.equals("tommy") && pass.equals("1234")) { // ok --> welcome.jsp로 
	%>
	<jsp:forward page = "welcome.jsp">
		<jsp:param value="<%= id %>" name="id"/>
	</jsp:forward>
	
	<%} else { %> <%-- 틀린 경우 초기 화면으로 go  --%>
		<jsp:forward page="Login.jsp"></jsp:forward>
	<%} %>
	
</body>
</html>