<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko-KR">

<head>
    <meta charset="utf-8">
    <title>:: Share Office - User Management Page for Admin::</title>
</head>

<body>
<table>
<thead>
<tr>
<th>ID</th>
<th>PW</th>
<th>이름</th>
<th>역할</th>
<th>생년월일</th>
<th>성별</th>
<th>전화번호</th>
<th>이메일</th>
<th>주소</th>
<th>분야</th>
</tr>
</thead>
<tfoot>
<tr>
<th>선택</th>
<th>학과 이름</th>
<th>학과장 명</th>
<th>학과 위치</th>
<th>학과 연락처</th>
<th>학과 인원</th>
</tr>
</tfoot>
<tbody>
<c:forEach items="${LIST}" var="list">
<tr>
<td><input type="checkbox" name="d_chk"	value="${list.dept_name}"></td>
<td><a href="s_test1.do?dname=${list.dept_name}">${list.dept_name}</a></td>
<td>${list.dept_head_prof}</td>
<td>${list.dept_loc}</td>
<td>${list.dept_tel}</td>
<td>${list.dept_st_count}</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>

</html>