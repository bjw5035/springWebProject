<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<SCRIPT>
		function enter() {
			alert("로그인 합니다.");

		}
	</SCRIPT>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

<form action="/login" method="post">
	아이디 : <input type="text" name="userId" id="id"> <br>
	비밀번호 : <input type="password" name="userPw" id="pw"> <br>
<%--	<input type="submit" value="로그인"><br>--%>
	<button type="submit" onclick="enter()">로그인</button>
</form>
</body>
</html>