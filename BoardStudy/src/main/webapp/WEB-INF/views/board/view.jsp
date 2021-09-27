<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language ="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset = "UTF-8">
<title>글조회</title>
</head>
<body>

<div id="nav">
	<%@ include file="../include/nav.jsp" %>
</div>
	
	<form method="post">
		<label>글제목</label>
		<input type="text" name="title" value="${view.title}"/><br />
		
		<label>작성자</label>
		<input type="text" name="writer" value="${view.writer}" /><br />
		
		<label>글내용</label>
		<textarea cols="50" rows="5" name="content">${view.content} </textarea><br />
		
		<div>
			<a href="/board/modify?bno=${view.bno}">글수정</a>,
			<a href="/board/delete?bno=${view.bno}">글삭제</a>
		</div>
	</form>
	
<!-- 댓글기능 -->
<hr />

<ul>
	<c:forEach items="${reply}" var="reply">
	<li>
		<div>
			<p>${reply.writer} / <fmt:formatDate value="${reply.regDate}" pattern="yyyy-mm-dd" /></p>
			<p>${reply.content}</p>
		</div>
	</li>
	</c:forEach>
</ul>
<div>
	<form method="post" action="/reply/write">
		<p>
			<label>댓글 작성자</label><input type="text" name="writer">
		</p>
		<p>
			<textarea rows="5" cols="50"></textarea>
		</p>
		<p>
			<input type="hidden" name="bno" value="${view.bno}">
			<button type="button">댓글 작성</button>
		</p>
	</form>	
</div>

</body>
</html>