<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko-KR">

<head>
    <meta charset="utf-8">
    <title>:: Share Office ::</title>
</head>

<body>
    <c:choose>
	    <c:when test="${loginId eq null}">
	        <a href=#>Login or Join</a><br/>
	        <a href="login.do"> - Login</a><br/>
	        <a href="join.do"> - Join</a><br/>
	    </c:when>
	    <c:otherwise>
	        :: ${loginRole} ${loginName} ::<br/>
	        <a href="userInformation.do">Information of User</a><br/>
	        <c:if test="${loginRole eq '관리자'}">
	            <a href="adminPage.do">Admin Page</a><br/>
	        </c:if>
	        <a href="logout.do">Logout</a><br/>
	    </c:otherwise>
    </c:choose>
    <a href=#>Introduction</a><br/>
    <a href=#> - Company</a><br/>
    <a href=#> - Room</a><br/>
    <a href=#> - Equipment</a><br/>
    <a href=#> - Service</a><br/>
    <a href=#>Reservation</a><br/>
    <a href=#> - Room</a><br/>
    <a href=#> - Date</a><br/>
    <a href="board.do">Board</a><br/>
    <a href=#> - Notice</a><br/>
    <a href=#> - Q&#38;A</a><br/>
    <a href=#> - Review</a><br/>
</body>

</html>