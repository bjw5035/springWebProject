<%--
  Created by IntelliJ IDEA.
  User: cook
  Date: 5/8/23
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인</title>
</head>
<body>
<div style="float: none; margin: 0 auto;">
    <h1>Login</h1>
    <form action="" name="LoginForm" method="post">
        <label>ID</label>
        <input type="text" name="userId">
        <label>PW</label>
        <input type="password" name="userPw">

        <%-- Form안에 들어가있지 않으면 작동을 하지 않음  --%>
        <button type="submit" id="login">login</button>
        <button type="button" onclick="location.href='join'">Join</button>
    </form>
    <button type="button" onclick="location.href='/'">Main</button>
</div>
</body>
</html>
