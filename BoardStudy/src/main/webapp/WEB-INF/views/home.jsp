<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session = "false" %>
<%@ page language ="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<meta charset = "UTF-8">
<title>HOME</title>
</head>
<body>
	<h1>안녕 안농농</h1>
	<p> The Time on the Server is ${serverTime}.</p>
	<p><a href="/board/list">게시물 목록</a></p>
</body>
</html>
