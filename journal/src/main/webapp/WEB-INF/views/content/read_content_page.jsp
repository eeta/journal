<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>게시글 보기</h1>
	
	제목: ${result.contentVo.content_title}<br>
	작성자: ${result.memberVo.member_nick}<br>
	조회수: ${result.contentVo.content_readcount}<br>
	작성일: ${result.contentVo.content_writedate}<br>
	내용: <br>
	${result.contentVo.content_content}<br>
	<br>
	<a href="${pageContext.request.contextPath}/content/main_page.do">목록으로</a>

</body>
</html>