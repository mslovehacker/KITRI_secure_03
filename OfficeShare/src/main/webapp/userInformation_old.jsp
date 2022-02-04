<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko-KR">

<head>
    <meta charset="utf-8">
    <title>:: Share Office - Change Information of User ::</title>
</head>

<body>
    <c:set var="user" value="${USER}"/>
    <form method="POST" id="informationForm" action="">
		        아이디: 
		        <input type="text"
		            id="id" name="id" value="${user.id}" disabled><br/>
		        이름: 
		        <input type="text"
		        id="name" name="name" value="${user.name}" disabled><br/>
		        생년월일: 
		        <input type="date" id="birth" name="birth" value="${user.birth}" disabled><br/>
		        성별: 
		        <input type="radio" name="gender" value="M" <c:if test="${user.gender=='M'}"> checked="checked" </c:if> disabled>남 
		        <input type="radio" name="gender" value="F" <c:if test="${user.gender=='F'}"> checked="checked" </c:if> disabled>여 *<br/>
		        전화번호: 
		        <input type="text"
		            id="phone" name="phone" value="${user.phone}" disabled><br/>
		        이메일: 
		        <input type="text"
		            id="email" name="email" value="${user.email}" disabled><br/>
		        주소: 
		        <input type="text"
		            id="address" name="address" value="${user.address}" disabled><br/>
		        직업: 
		        <input type="text"
		            id="field" name="field" value="${user.field}" disabled><br/>
		        <input type="button" value="회원 정보 수정" onclick="location.href='changeUserInformation.do'">
		        <input type="button" value="회원 탈퇴" onclick="location.href='deleteUser.do'">
    </form>
    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
	<script src="js/userRestriction.js"></script>
</body>

</html>