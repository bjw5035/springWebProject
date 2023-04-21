<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<html>
<head>
	<title>메인페이지</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%--	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">--%>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/admin-lte@3.2/dist/css/adminlte.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<%--	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
	<script src="https://cdn.jsdelivr.net/npm/admin-lte@3.2/dist/js/adminlte.min.js"></script>
	<script>
		/*$(document).ready(function () {
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
		});*/
		
	</script>
	<style>
		div#side-left{
			width: 200px;
			height: 400px;
			background-color: white;

		}
	</style>
</head>
<body>

<div class="container" type="header">
	<form action="/main" method="post" name="inputIdPw">
		<label> 아이디: <input type="text" id="userId" name="userId" style="width: auto; height: 30px; color: black;"></label><br>
		<div class="passowrd" style="background-color: yellow">
			<label> 패스워드: <input type="password" id="userPw" name="userPw" style="width: auto; height: 30px;" ></label><br>
		</div>
		<div class="accordion-button" style="background-color: #0d6efd">
			<button type="submit" id="login" name="login" align="center">로그인</button>

			<%-- onClick 사용시 join.jsp를 사용하면 에러남, .jsp를 사용하지 않아야함.--%>
			<button type="button" id="join" onclick="location.href='join'" align="center">회원가입</button>
		</div>
	</form>
</div>

</body>
</html>
