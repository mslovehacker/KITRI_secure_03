<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko-KR">

<head>
    <meta charset="utf-8">
    <title>:: Share Office - Delete User (${loginName}) ::</title>
</head>

<body>
    <c:set var="user" value="${USER}"/>
    <div>탈퇴하시려면 아이디와 비밀번호를 다시 입력하세요.</div>
    <form method="POST" id="deleteForm" action="deleteAction.do">
	       아이디: 
	        <input type="text"
	            placeholder="아이디를 입력하세요..."
		        id="id" name="id" required><input type="hidden" id="sessionId" value="${loginId}"><br/>*
	        비밀번호: 
	        <input type="password"
	            placeholder="비밀번호를 입력하세요..."
	            id="pw" name="pw" required>*<br/>
	    <div id="deleteCaution"></div>
        <input type="button" value="회원 탈퇴" onclick="deleteUser()">
    </form>
    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
	<script src="js/userRestriction.js"></script>
</body>

</html>