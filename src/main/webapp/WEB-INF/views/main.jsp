<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<html>
<head>
	<title>메인페이지</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script>
		$(document).ready(function () {
			$("#btnLogin").click(function () {
				// 태그.val() : 태그에 입력된 값
				// 태그.val('값') : 태그의 값을 변경
				var id = $("id").val();
				var pw = $("pw").val();
				if (id == "") {
					alert("아이디를 입력하세요.");
					$("#id").focus(); // 입력 포커스 이동
					return; // 함수 종료
				}
				if (pw == "") {
					alert("패스워드를 입력하세요.");
					$("pw").focus();
					return;
				}
			});
		});
	</script>
</head>
<body>
	<form action="" method="POST">
		<label> 아이디: <input type="text" id="id"
			style="width: auto; height: 30px;">
		</label><br> <label> 패스워드: <input type="password" id="pw">
		</label>

		<%--		<button type="submit" id="btnLogin" align="center">로그인</button>--%>
		<button type="submit" name="login" align="center">로그인</button>
		
		<%--		<button type="submit" id="logout" align="center">로그아웃</button>--%>
	</form>
	
	<form action="/join.jsp" method="POST">
		<a href="/join">회원가입</a>
	</form>

</body>
</html>
