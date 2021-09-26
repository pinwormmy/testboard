<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language ="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
	<li>
		<div>
			<p>첫번째 댓글 작성자</p>
			<p>첫번째 댓글</p>
		</div>
	</li>
	<li>
		<div>
			<p>두번째 댓글 작성자</p>
			<p>두번째 댓글</p>
		</div>
	</li>
	<li>
		<div>
			<p>세번째 댓글 작성자</p>
			<p>세번째 댓글</p>
		</div>
	</li>
</ul>
<div>
	<p>
		<label>댓글 작성자</label><input type="text">
	</p>
	<p>
		<textarea rows="5" cols="50"></textarea>
	</p>
	<p>
		<button type="button">댓글 작성</button>
	</p>
</div>

</body>
</html>