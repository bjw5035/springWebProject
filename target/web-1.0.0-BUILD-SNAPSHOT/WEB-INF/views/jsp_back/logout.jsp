<%--
  Created by IntelliJ IDEA.
  User: cook
  Date: 5/21/23
  Time: 1:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // 세션 값 초기화하기: session.invalidate();
    // 1: 기존의 세션 데이터를 모두 삭제
    session.invalidate();
    // 2: 로그인 페이지로 이동시킴.
    response.sendRedirect("/");
%>
<html>
<head>
    <title>LogOut</title>
</head>
<body>

</body>
</html>
