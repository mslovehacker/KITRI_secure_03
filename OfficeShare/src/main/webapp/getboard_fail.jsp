<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>One board</title>
</head>
<body onload="fail()">
<script type="text/javascript">
	function fail(){
		alert("열람 권한이 없습니다. 작성자 본인 및 관리자만 열람 가능합니다.");
		history.back();
	}
</script>


</body>
</html>