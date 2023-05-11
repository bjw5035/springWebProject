<%--
  Created by IntelliJ IDEA.
  User: cook
  Date: 5/8/23
  Time: 7:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>메인게시판</title>
<%--    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">--%>
    <meta name="viewport" content="width=device-width", initial-scale"="1">
    <link rel="stylesheet" href="resources/css/bootstrap.css">
</head>
<body>
<%
    String userId = null;
    if (session.getAttribute("userId") != null) {
        userId = (String) session.getAttribute("userId");
    }
%>
<nav class="navbar navbar-default">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed"
                data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
                aria-expanded="false">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="main">JSP 게시판 웹 사이트</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
            <li><a href="main">메인</a></li>
            <li><a href="login">로그인</a></li>
            <li><a href="join">회원가입</a></li>
<%--            <li class="active"><a href="bbs.jsp">게시판</a></li>--%>
        </ul>
        <%
            if (userId == null) {
        %>
        <ul class="nav navbar-nav navbar-right">
            <li class="dropdown">
<%--                <a href="#" class="dropdown-toggle"--%>
<%--                   data-toggle="dropdown" role="button" aria-haspopup="true"--%>
<%--                   aria-expanded="false">접속하기<span class="caret"></span></a>--%>
                <ul class="dropdown-menu">
                    <li><a href="login.jsp">로그인</a></li>
                    <li><a href="join.jsp">회원가입</a></li>
                </ul>
            </li>
        </ul>
        <%
        } else {
        %>
        <ul class="nav navbar-nav navbar-right">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle"
                   data-toggle="dropdown" role="button" aria-haspopup="true"
                   aria-expanded="false">회원관리<span class="caret"></span></a>
<%--                <ul class="dropdown-menu">--%>
<%--                    <li><a href="logoutAction.jsp">로그아웃</a></li>--%>
<%--                </ul>--%>
            </li>
        </ul>
        <%
            }
        %>

    </div>
</nav>
<div class="container">
    <div class="row">
        <table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
            <thead>
            <tr>
                <th style="background-color: #eeeeee; text-align: center;">번호</th>
                <th style="background-color: #eeeeee; text-align: center;">제목</th>
                <th style="background-color: #eeeeee; text-align: center;">작성자</th>
                <th style="background-color: #eeeeee; text-align: center;">작성일</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>1</td>
                <td vlaue="{title}">안녕하세요</td>
                <td>홍길동</td>
                <td>2017-05-04</td>
            </tr>
            </tbody>
        </table>
        <a href="boardWrite" class="btn btn-primary pull-right">글쓰기</a>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<%--<script src="${path}/js/bootstrap.js"></script>--%>


<%--<button type="button" onclick="location.href='login'" >로그인</button>--%>
<%--<button type="button" onclick="location.href='join'" >회원가입</button>--%>
</body>
</html>
