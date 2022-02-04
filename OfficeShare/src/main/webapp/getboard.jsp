<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>One board</title>
</head>
<body>


<div align = "center">

	<table border=1 width=500>
	
	<tr>
		<td> 글번호 </td> <td> <input type="text" readonly value = "${LIST[0].id}" name = "id"></td>
	</tr>
	<tr>
		<td> 글제목 </td> <td> <input type="text" readonly value = "${LIST[0].subject}" name = "subject"></td>
	</tr>
	<tr>
		<td> 작성자 </td> <td> <input type="text" readonly value = "${LIST[0].userId}" name = "userid"></td>
	</tr>
	<tr>
		<td> 내용 </td> <td><textarea rows="10" cols="50" readonly="readonly" name="content">${LIST[0].content}</textarea></td>		 
	</tr>
	<tr>
		<td> 작성일 </td> <td> <input type="text" readonly value = "${LIST[0].writeAt}" name = "date"></td>
	</tr>
	<tr>
		<td> 조회수 </td> <td> <input type="text" readonly value = "${LIST[0].hit}" name = "hit">
		<input type="hidden" readonly value = "${LIST[0].protect}" name = "protect"></td>
	</tr>
	
	</table>
	
	<input type ="button" value = "edit" onclick="location.href='boardModify.do?id=${LIST[0].id}&code=modView'">
	<input type ="button" value = "delete" onclick="location.href='deleteboard.jsp?id=${LIST[0].id}'">
	<input type ="button" value = "list" onclick="location.href='board.do'">
		


</div>

</body>
</html>