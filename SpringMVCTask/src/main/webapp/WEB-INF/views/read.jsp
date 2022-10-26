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
		<h1>세부 공지사항</h1>
		
	<br>
			<table class="table table-bordered"><TR>
				<TH>NUM</TH>
				<TD>${notice.num }</TD>
				<Th>NAME</TH>
				<TD>${notice.job }</TD>
			</TR>
			<TR>
				<TH>DATE</TH>
				<TD>${notice.posted_date }</TD>
				<TH>COUNT</TH>
				<TD>${notice.cnt }</TD>
			</TR>
			<TR>
				<TH>TITLE</TH>
				<TD COLSPAN=3>${notice.title}</TD>			
			</TR>
			<TR>
				<TH>CONTENT</TH>
				<TD COLSPAN=3>
				<textarea readonly class="form-control" rows="5" id="comment" name="comment">${notice.content }</textarea>
			</td>
			</div>
			</TR>
		</TABLE>	
		<a href="modify?num=${notice.num }">수정하기</a>
		<a href="delete?num=${notice.num }">삭제하기</a>
		<a href="list">초기화면</a>
		<br><br>

	</div>
</body>
</html>






