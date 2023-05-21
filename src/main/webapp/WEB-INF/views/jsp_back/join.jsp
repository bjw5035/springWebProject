<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8" />
	<title>회원가입</title>

</head>
<body class="page-template-default page page-id-7 page-parent woocommerce theme-dokan woocommerce-account woocommerce-page woocommerce-no-js dokan-theme-dokan">

<form action="" method="post">
	<label>아이디:</label>
	<input type="text" name="userId"><br/>

	<label>비밀번호:</label>
	<input type="password" name="userPw"><br/>

	<label>이름:</label>
	<input type="text" name="userName"><br/>

	<label>나이:</label>
	<input type="text" name="userAge"><br/>
</form>
<%--	<label>전화번호:</label>--%>
<%--	<select name="phon1">--%>
<%--		<option>010</option>--%>
<%--		<option>02</option>--%>
<%--		<option>031</option>--%>
<%--		<option>051</option>--%>
<%--	</select>--%>
<%--	- <input type="text" name="phone2" size="5">--%>
<%--	- <input type="text" name="phone3" size="5">--%>

<%--	<br/>--%>
<%--	<input type="radio" name="gender" value="m" checked>남자--%>
<%--	<input type="radio" name="gender" value="f">여자--%>

	<button type="submit" value="가입">가입</button>
	<button type="button" onclick="location.href='/'">메인</button>

</form>
</body>
</html>