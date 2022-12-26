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
<%--<nav style="right: auto">--%>
	<form action="" method="POST">
		<label> 아이디: <input type="text" id="id" style="width: auto; height: 30px;"> </label><br>
		<label> 패스워드: <input type="password" id="pw" > </label>
		
<%--		<button type="submit" id="btnLogin" align="center">로그인</button>--%>
		<button align="center" type="button">로그인</button>
<%--		<button type="submit" id="btnJoin" align="center">회원가입</button>--%>
<%--		<button type="submit" id="logout" align="center">로그아웃</button>--%>
	</form>
<%--</nav>--%>
<nav>
	<div>
		<ul>
			<ou>test1
				<li>litest</li>
			</ou>
			<li>testtttt</li>
		</ul>
	</div>
</nav>
<%-- 
<div>
	<table board="1">
		<colgroup>
			<col style="width: 5%;"/>
			<col style="width: auto;"/>
			<col style="width: 15%;"/>
			<col style="width: 10%;"/>
			<col style="width: 10%;"/>
		</colgroup>
		<thead>
		<tr>
			<th>NO</th>
			<th>글제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
		</tr>
		</thead>
		<tbody>
		<c:choose>
			<c:when test="${empty boardList }" >
				<tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>
			</c:when>
			<c:when test="${!empty boardList}">
				<c:forEach var="list" items="${boardList}">
					<tr>
						<td><c:out value="${list.bid}"/></td>
						<td><c:out value="${list.title}"/></td>
						<td><c:out value="${list.reg_id}"/></td>
						<td><c:out value="${list.view_cnt}"/></td>
						<td><c:out value="${list.reg_dt}"/></td>
					</tr>
				</c:forEach>
			</c:when>
		</c:choose>
		</tbody>
	</table>
</div>
 --%>
</body>
</html>
