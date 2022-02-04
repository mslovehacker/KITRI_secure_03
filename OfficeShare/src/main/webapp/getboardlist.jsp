<%@ page import="kr.re.kitri.dao.BoardDao"%>
<%@ page import="kr.re.kitri.domain.BoardBean"%>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main page</title>
</head>
<body>

<div align = "center">
	<table border=1 width=700>
	
	<tr>
		<td> No. </td> <td> title </td> <td> writer </td> <td> open </td>
	</tr>
	
	<%
		BoardDao manager = new BoardDao();
		BoardBean[] list = manager.getAllBoard();
		for(BoardBean board : list){
	%>
		<tr>
		<td><%= board.getId() %></td>
		<td><a href="getboard.jsp?id=<%= board.getId() %>"><%= board.getSubject() %></a></td>
		<td><%= board.getUserId() %></td>
		<td><%= board.getProtect() %></td>
		
		</tr>
	<% 
		}
	%>
	</table>

</div>
</body>
</html>