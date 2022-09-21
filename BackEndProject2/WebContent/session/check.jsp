<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = (String) session.getAttribute("id");
	String pass = (String) session.getAttribute("pass");
	ArrayList<String> list = (ArrayList<String>) session.getAttribute("list");
	
	if (id != null && pass != null && list != null) {
		
%>

안녕하세요? <%= id %>님!! <br>
패스워드는 <%= pass %>입니다! <hr>

	<%
		for(String color : list) {
	%>
		<%= color %><br>
	<% 
		}
	} else {
		out.println("세션 안에 값이 없습니다!");
	}
	%>

<a href="delete.jsp">삭제하기</a>


</body>
</html>