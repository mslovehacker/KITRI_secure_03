<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko-KR">

<head>
    <meta charset="utf-8">
    <title>:: Share Office - Login ::</title>
</head>

<body>
    <form method="POST" id="loginForm" action="loginAction.do">
        아이디: 
        <input type="text" placeholder="Input ID..." id="id" name="id"><br/>
        비밀번호: 
        <input type="password" placeholder="Input PW..." id="pw" name="pw"><br/>
        <!-- JYJ: ID/PW save checkbox -->
        <div id="loginCaution"></div>
        <input type="button" value="LOGIN" onclick="login()">
    </form>
    <a href="join.do">JOIN</a>
    <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
	<script src="js/userRestriction.js"></script>
</body>

</html>