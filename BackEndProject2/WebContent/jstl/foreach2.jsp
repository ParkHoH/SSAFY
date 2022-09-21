<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String[] movieList = {"iron man", "super man", "bat man"};
	//pageContext.setAttribute("movieList", movieList); // 페이지가 있을 동안만
	request.setAttribute("movieList", movieList); // forward가 가능함
	//session.setAttribute("movieList", movieList); // 세션이 만료될 때까지 남아있음
	//application.setAttribute("movieList", movieList); // 톰캣을 끌 때가지 계속 남아있음
%>

<h1>Movie Name</h1>

<table border="1">
	<c:forEach items="${movieList}" var="movie" varStatus="stat">
		<tr>
			<td>${stat.count}</td>
			<td>${movie }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>