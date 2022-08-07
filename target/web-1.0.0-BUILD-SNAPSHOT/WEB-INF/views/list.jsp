<%--
  Created by IntelliJ IDEA.
  User: jaewoo
  Date: 2022-07-19
  Time: 오후 3:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>자유게시판 화면</title>
    <style>
        /*.t_ab1 {background: white; width: 50%; margin: 0; text-align: center; border-collapse: collapse;}
        .t_ab1-1 {background: white; margin: auto;}*/
    </style>
</head>
<body>
<header>
    <h1>자유게시판 <a href="home.jsp">Home</a></h1>
</header>
<aside>
    <h4>게시판 목록</h4>
    <ul>
        <li><a target="iframe1" href="home.jsp">Home test</a></li> <%-- target iframe으로 지정하여 링크를 클릭하면 새창으로 띄운다.--%>
    </ul>
</aside>
<nav>
    <ul>
        <li><a href="home.jsp">Home</a></li>
        <li><a href="home.jsp">test2</a></li>
        <li><a href="home.jsp">test3</a></li>
        <li><a href="home.jsp">test4</a></li>
    </ul>
</nav>
<%--<div class="container">
    <div id="header">
        <h1>자유게시판</h1>
    </div>
    <nav>
        <h1>nav테스트</h1>
    </nav>
    <div id="content">
        <table class="t_ab1" border="1">
            <th>No.</th>
            <th>제목</th>
            <th>내용</th>

        <tr class="t_ab1-1">
            <td> 1</td>
            <td>테스트</td>
            <td>테스트 내용</td>
        </tr>
        </table>
    </div>
    <div class="row1">

    </div>
    <div align="auto" id="footer">
        <button class="accordion-button"> 글쓰기</button>
    </div>

</div>--%>
</body>
</html>
