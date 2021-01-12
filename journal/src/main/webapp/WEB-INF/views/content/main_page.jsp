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

	<c:choose>
		<c:when test="${!empty sessionUser}">
			${sessionUser.member_nick} 님 환영합니다.		
			<a href="${pageContext.request.contextPath}/member/sign_out_process.do">로그아웃</a>
		</c:when>
		
		<c:otherwise>
			비회원으로 접근했습니다.
			<a href="${pageContext.request.contextPath}/member/sign_in_page.do">로그인 페이지로</a>
		</c:otherwise>
	</c:choose>
	
	<br>
	제목 리스트 출력<br>
	
	<c:choose>
		<c:when test="${!empty sessionUser}">
			<a href="${pageContext.request.contextPath}/content/write_content_page.do">글쓰기</a>
		</c:when>
	</c:choose>

</body>
</html>