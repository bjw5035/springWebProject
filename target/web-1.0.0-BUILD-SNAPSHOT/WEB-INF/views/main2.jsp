<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Main</title>

<!-- BootStrap Jquery -->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resources/js/scripts.js"></script>

<!-- BootStrap CSS -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/styles.css"></link>
</head>
<body>

	<h2>게시판 리스트 페이지</h2>

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
	<a href="/web/myModify" /> 마이페이지 수정 화면 테스트
</body>
</html>
