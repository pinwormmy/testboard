<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session = "false" %>
<%@ page language ="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<meta charset = "UTF-8">
<title>게시판 만들기 공부</title>
</head>
<body>
	<h1>안녕 안농농</h1>
	<p> 현재 서버기준 시간은 ${serverTime}.</p>
	<p>
		<a href="/board/list?num=1">글 목록</a><br/>
		<a href="/board/write">글 작성하기</a>
	</p>
</body>
</html>
