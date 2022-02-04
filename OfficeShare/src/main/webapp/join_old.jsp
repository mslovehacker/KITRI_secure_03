<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko-KR">

<head>
    <meta charset="utf-8">
    <title>:: Share Office - Join ::</title>
</head>

<body>
    <form method="POST" id="joinForm" action="joinAction.do">
        아이디: 
        <input type="text"
            placeholder="5-13자 이내의 ID를 입력하세요..." id="id" name="id" required>*
            <span id="idCaution"></span><br/>
        비밀번호: 
        <input type="password"
            placeholder="영어와 숫자를 모두 사용한 8-18자 이내의 비밀번호를 입력하세요..."
            id="pw" name="pw" required>*<span id="pwCaution"></span><br/>
        비밀번호: 
        <input type="password"
            placeholder="비밀번호를 다시 한 번 입력하세요..." id="pw2" name="pw2" required>*
            <span id="pw2Caution"></span><br/>
        이름: 
        <input type="text" placeholder="이름을 입력하세요..."
        id="name" name="name" required>
        *<span id="nameCaution"></span><br/>
        생년월일: 
        <input type="date" id="birth" name="birth" required>*<br/>
        성별: 
        <input type="radio" name="gender" value="M" required>남 
        <input type="radio" name="gender" value="F">여 *<br/>
        전화번호: 
        <input type="text" placeholder="010-0000-0000 형태로 전화번호를 입력하세요..."
            id="phone" name="phone" required>*
        <span id="phoneCaution"></span><br/><!-- JYJ: 인증 버튼 -->
        이메일: 
        <input type="text" placeholder="이메일을 입력하세요..."
            id="email" name="email" required>*
        <span id="emailCaution"></span><br/><!-- JYJ: 인증 버튼 -->
        주소: 
        <input type="text" placeholder="주소를 입력하세요..."
            id="address" name="address"><br/>
        직업: 
        <input type="text" placeholder="직업을 입력하세요..."
            id="field" name="field"><br/>
        <input type="button" value="회원 가입" onclick="join()">
        <!-- JYJ: 대충 약관에 동의 -->
    </form>
    <a href="login.do">로그인</a>
    <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
	<script src="js/userRestriction.js"></script>
</body>

</html>