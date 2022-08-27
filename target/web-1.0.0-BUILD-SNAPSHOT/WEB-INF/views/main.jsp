<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Main</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<h2>게시판 리스트 페이지</h2>

	<div>
		<nav class="navbar navbar-brand navbar-dark bg-dark">
			<header> 어제보다 나은사람이 되자!! </header>
			<ou>test1
				<li>litest</li>
			</ou>
			<li>testtttt</li>
		</nav>
	</div>

	<div>
		<table board="1">
			<colgroup>
				<col style="width: 5%;" />
				<col style="width: auto;" />
				<col style="width: 15%;" />
				<col style="width: 10%;" />
				<col style="width: 10%;" />
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
				<%-- <c:choose>
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
				</c:choose> --%>
			</tbody>
		</table>
	</div>
	<div>
		<a href="/web/myModify" /> 마이페이지 수정 화면 테스트
	</div>
	<div>
		<button type="button" href="/web/upLoadFile.jsp">올리기</button>
	</div>
</body>
</html>
