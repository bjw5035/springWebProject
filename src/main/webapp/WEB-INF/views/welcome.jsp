<%--
  Created by IntelliJ IDEA.
  User: jaewoo
  Date: 2022-08-13
  Time: PM 2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- 합쳐지고 최소화된 최신 CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <!-- 부가적인 테마 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
    <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

    <title>Welcome</title>
</head>
<body>
    <nav class="navbar navbar-expand navbar-dark bg-dark">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href="./home.jsp">Home</a>
            </div>
        </div>
    </nav>
    <%! String greeting = "Welcome to Web Shopping Mall";
        String tagline = "Welcome to Web Market!" ;%>

    <div class="jumbotron">
        <div class="container">
            <h1 class="display-3">
                <%= greeting%>
            </h1>
        </div>
    </div>

    <div class="container">
        <div class="text-center">
            <h3>
                    <%= tagline %>
            </h3>
        </div>
    </div>
    <footer class="container">
        <p>&copy; WebMarket</p>
    </footer>

</body>
</html>
