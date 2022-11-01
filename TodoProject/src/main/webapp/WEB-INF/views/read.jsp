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
		<img src="resources/image/f2.jpg" />
		<c:if test="${b.done eq 'N'}">
			<h1 style="color: red;">게시판 글읽기</h1>
		</c:if>
		<c:if test="${b.done eq 'Y'}">
			<h1>게시판 글읽기</h1>
		</c:if>
		<br>
		<table class="table table-bordered">
			<TR>
				<TH>NUM</TH>
				<TD>${b.num }</TD>
				<Th>ID</TH>
				<TD>${b.id }</TD>
			</TR>
			<TR>
				<TH>SDATE</TH>
				<TD>${b.sdate }</TD>
				<TH>EDATE</TH>
				<TD>${b.edate }</TD>
			</TR>
			<TR>
				<TH>CONTENT</TH>
				<TD COLSPAN=3><textarea readonly class="form-control" rows="5"
						id="comment" name="comment">${b.content }</textarea></td>
			</TR>
		</TABLE>
		<a href="complete?num=${b.num }">완료하기</a><br> <a
			href="update?num=${b.num }">수정하기</a><br> <a
			href="delete?num=${b.num }">삭제하기</a><br> <a href="list">초기화면</a>
		<br> <br>

	</div>
</body>
</html>






