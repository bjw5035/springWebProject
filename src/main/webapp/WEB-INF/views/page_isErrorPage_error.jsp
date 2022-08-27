<%--
  Created by IntelliJ IDEA.
  User: jaewoo
  Date: 2022-08-14
  Time: PM 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Directives Tag</title>
</head>
<body>
<h4>에러가 발생했습니다.</h4>
<h5>exception 내장 객체 변수</h5>
<%
  exception.printStackTrace(new java.io.PrintWriter(out));
%>
</body>
</html>
