<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language ="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset = "UTF-8">
<title>글조회</title>
</head>
<body>
	<form method="post">
		<label>글제목</label>
		<input type="text" name="title" value="${view.title}"/><br />
		
		<label>작성자</label>
		<input type="text" name="writer" value="${view.writer}" /><br />
		
		<label>글내용</label>
		<textarea cols="50" rows="5" name="content">${view.content} </textarea><br />
		
		<div>
			<a href="/borad/modify?bno=${view.bno}">글수정</a>
		</div>
		
<!-- 	<button type="submit">게시하기</button> -->	
	</form>
</body>
</html>