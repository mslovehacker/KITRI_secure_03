<%@ page import="kr.re.kitri.dao.BoardDao"%>
<%@ page import="kr.re.kitri.domain.BoardBean"%>
<%@ page import= "java.sql.Date"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   
<%
   BoardBean vo = new BoardBean();
   BoardDao dao = new BoardDao();

   int id = Integer.parseInt(request.getParameter("id"));

%>
   
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>One board</title>
</head>
<body>

<script> location.href="boardDelete.do?id=<%= id %>"</script>

</body>
</html>