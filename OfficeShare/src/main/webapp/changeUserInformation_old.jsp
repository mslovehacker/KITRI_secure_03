<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko-KR">

<head>
    <meta charset="utf-8">
    <title>::: Share Office - Change Information of User :::</title>
    <!-- 아아아아아 -->
</head>

<body>
    <c:set var="user" value="${USER}"/>
    <form method="POST" id="changeForm" action="changeAction.do">
	       아이디: 
	        <input type="text"
	            value="${user.id}" disabled required><input type="hidden" id="id" name="id" value="${user.id}">*
	            <span id="idCaution">아이디는 변경할 수 없습니다.</span><br/>
	        기존 비밀번호: 
	        <input type="password"
	            placeholder="기존 비밀번호를 입력하세요..."
	            id="pw" name="pw" required>*<span id="pwCaution">회원 정보를 수정하시려면 기존 비밀번호를 다시 입력하셔야합니다.</span><br/>
	        새 비밀번호: 
	        <input type="password"
	            placeholder="영어와 숫자를 모두 사용한 8-18자 이내의 비밀번호를 입력하세요..."
	            id="pw1" name="pw1" required>*<span id="pw1Caution"></span><br/>
	        새 비밀번호: 
	        <input type="password"
	            placeholder="비밀번호를 다시 한 번 입력하세요..." id="pw2" name="pw2" required>*
	            <span id="pw2Caution"></span><br/>
	        이름: 
	        <input type="text"
	        id="name" name="name" value="${user.name}" required>
	        *<span id="nameCaution"></span><br/>
	        생년월일: 
	        <input type="date" id="birth" name="birth" value="${user.birth}" required>*<br/>
	        성별: 
	        <input type="radio" name="gender" value="M" <c:if test="${user.gender=='M'}"> checked="checked" </c:if> required>남 
			<input type="radio" name="gender" value="F" <c:if test="${user.gender=='F'}"> checked="checked" </c:if>>여 *<br/>
	        전화번호: 
	        <input type="text"
	            id="phone" name="phone" value="${user.phone}" required>*
	        <span id="phoneCaution"></span><br/><!-- JYJ: 인증 버튼 -->
	        이메일: 
	        <input type="text"
	            id="email" name="email" value="${user.email}" required>*
	        <span id="emailCaution"></span><br/><!-- JYJ: 인증 버튼 -->
	        주소: 
	        <input type="text"
	            id="address" name="address"value="${user.address}"><br/>
	        직업: 
	        <input type="text"
	            id="field" name="field" value="${user.field}"><br/>
        <input type="button" value="회원 정보 수정" onclick="change()">
    </form>
    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
	<script src="js/userRestriction.js"></script>
</body>

</html>