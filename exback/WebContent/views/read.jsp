<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<%@ include file="/include/head.jsp" %>
</head>
<body>
	<%@ include file="/include/nav.jsp" %>	

	<div class="container text-center">
	<img src="image/f2.jpg"/>
		<h1>글 읽기</h1>			
	<br>
			<table class="table table-bordered"><TR>
				<TH>ISBN</TH>
				<TD>${ b.isbn }</TD>
				<Th>TITLE</TH>
				<TD>${ b.title }</TD>
			</TR>
			<TR>
				<TH>DATE</TH>
				<TD>${ b.regdate }</TD>
				<TH>PRICE</TH>
				<TD>${ b.price }</TD>
			</TR>
			<TR>
				<TH>-</TH>
				<TD COLSPAN=3>-</TD>
			</TR>
			<TR>
				<TH>CONTENT</TH>
				<TD COLSPAN=3>
				<textarea readonly class="form-control" rows="5" id="content" name="content">${ b.descript }</textarea>
			</td>
			</div>
			</TR>
		</TABLE>
	 <a class="btn btn-info" href="list.bod">목록</a>
	 <a class="btn btn-danger" href="delete.bod?isbn=${ b.isbn }">삭제</a>
	<br><br>

	</div>
</body>
</html>






