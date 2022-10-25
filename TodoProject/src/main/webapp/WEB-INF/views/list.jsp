<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container text-center">
		<img src="resources/image/f1.jpg" />
		<h1>TODO LIST</h1>
		
		<%-- <jsp:include page="loginCheck.jsp" />
		 --%>
		<form action="search" method="post">
			검 색: <select name="condition">
				<option value="id">아이디</option>
				<option value="content">내용</option>
			</select> 
			<input type="text" name="word"> 
			<input type="submit" value="검색">
		</form>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>번호</th>
					<th>내용</th>
					<th>달성 여부</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list }" var="row">
					<tr>
						<td><a href="read?num=${row.num }">${row.num }</a></td>
						<td>${row.content }</td>
						<td><a href="complete?num=${row.num }" onclick="return confirm('달성 여부를 변경하시겠습니까?')">${row.done }</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="insert">새 todo 등록</a> /
		<a href="deleteAll" onclick="return confirm('정말 모두 삭제하시겠습니까?')">전체 todo 삭제</a> <br>
		<a href="list">전체 목록</a>
	</div>
</body>
</html>














