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
	<img src="resources/image/f2.jpg"/>
		<h1>TODO DETAIL</h1>
		
	<br>
			<table class="table table-bordered"><TR>
				<TH>NUM</TH>
				<TD>${todo.num }</TD>
				<Th>ID</TH>
				<TD>${todo.id }</TD>
			</TR>
			<TR>
				<TH>SDATE</TH>
				<TD>${todo.sdate }</TD>
				<TH>EDATE</TH>
				<TD>${todo.edate }</TD>
			</TR>
			<TR>
				<TH>DONE</TH>
				<TD COLSPAN=3><a href="complete?num=${todo.num }" onclick="return confirm('달성 여부를 변경하시겠습니까?')">${todo.done}</a></TD>			
			</TR>
			<TR>
				<TH>CONTENT</TH>
				<TD COLSPAN=3>
				<textarea readonly class="form-control" rows="5" id="comment" name="comment">${todo.content }</textarea>
			</td>
			</div>
			</TR>
		</TABLE>	
		<a href="modify?num=${todo.num }">수정하기</a> /
		<a href="delete?num=${todo.num }" onclick="return confirm('정말 삭제하시겠습니까?')">삭제하기</a> <br>	
		<a href="list">전체 목록</a>
		<br><br>

	</div>
</body>
</html>






