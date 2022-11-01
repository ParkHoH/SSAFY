<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>예외 페이지</h1>
	<c:if test="${ !empty errormsg }">
		${ errormsg }
	</c:if>
	<a href="list">초기화면</a>
	
</body>
</html>