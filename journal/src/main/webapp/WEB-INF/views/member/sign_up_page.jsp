<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>회원가입</h1>
	
	<form action="${pageContext.request.contextPath}/member/sign_up_process.do" method="post">
		아이디: <input type="text" name="member_id"><br>
		비밀번호: <input type="password" name="member_pw"><br>
		닉네임(별명): <input type="text" name="member_nick"><br>
		성별:
		<input type="radio" name="member_sex" value="M">남
		<input type="radio" name="member_sex" value="F" checked>여<br>
		지역:
		<select name="member_region">
			<option value="seoul" selected>서울
			<option value="daejeon">대전
			<option value="daeju">대구
			<option value="gwangju">광주
			<option value="busan">부산
		</select><br>
		전화번호: <input type="text" name="member_phone"><br>
		<input type="submit" value="회원가입">
	</form>

</body>
</html>