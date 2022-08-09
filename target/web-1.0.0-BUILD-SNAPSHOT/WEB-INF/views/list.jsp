<%--
  Created by IntelliJ IDEA.
  User: jaewoo
  Date: 2022-07-19
  Time: 오후 3:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:th="http://www.thymeleaf.org" layout:decorator="layout">
<th:block layout:fragment="content">
    <%-- 검색 영역 --%>
    <div class="input-group" id="adv-search">
        <select id="searchType" class="form-control" style="width: 100px";>
            <option value="">전체</option>
            <option value="title">제목</option>
            <option value="content">내용</option>
            <option value="writer">작성자</option>
        </select>
        <input type="text" id="searchKeywoard" class="form-control" placeholder="키워드를 입력해 주세요" style="width: 300px" />
        <button type="button" class="btn btn-primary">
<%--            <span aria-hidden="true" class="glyphicon glyphicon-search"></span>--%>
        </button>
    </div>
</th:block>
<head>
</head>
<body>
</body>
</html>
