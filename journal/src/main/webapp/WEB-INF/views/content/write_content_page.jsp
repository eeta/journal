<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>자유게시판 글쓰기</h1>
	
	<form action="${pageContext.request.contextPath}/content/write_content_process.do" method="post">
		작성자: ${sessionUser.member_nick}<br>
		제목: <input type="text" name="content_title"><br>
		내용: <textarea name="content_content" rows="10" cols="60"></textarea>
		<input type="submit" value="글쓰기">
	</form>
	
</body>
</html>