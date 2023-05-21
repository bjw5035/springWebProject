<%--
  Created by IntelliJ IDEA.
  User: cook
  Date: 5/8/23
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
<html>
<head>
    <title>로그인</title>
    <script>
        $(".btn-login").on("click", function () {
            let userId = $("#userId").val();
            let userPw = $("#userPw").val();

                if (userId === "") {
                    alert("아이디를 입력해 주세요.");
                } else if (userPw === "") {
                    alert("pw를 입력해 주세요.");
                } else {
                    alert("Login 완료");
                }
        });
    </script>
</head>
<body>
<div style="float: none; margin: 0 auto;">
    <form action="" name="LoginForm" method="post" id="Login_Form">
        <label>ID</label>
        <input type="text" name="userId" id="userId"><br>
        <label>PW</label>
        <input type="password" name="userPw" id="userPw"><br>

        <%-- Form안에 들어가있지 않으면 작동을 하지 않음  --%>
        <button class="btn-login" type="submit" id="login" onclick="">로그인</button>
        <button type="button" onclick="location.href='join'">회원가입</button>
        <button type="button" onclick="location.href='/'">메인</button>
    </form>
</div>
</body>
</html>
