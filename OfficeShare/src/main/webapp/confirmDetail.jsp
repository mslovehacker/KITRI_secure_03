<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko-KR">

<head>
	<script type="text/javascript">
     

     function test(){
    	 alert("예약이 완료되었습니다.")
    	 window.location.href = "http://localhost:8989/OfficeShare/inforoom.jsp";
    	 
     }
     
       
	</script>
    <meta charset="utf-8">
    <title>:: Booking ::</title> 
</head>

<body><img src = "https://www.musinsastudio.com/v2/img/photo/img_product21.jpg" height="448" width="896">
	  <br><h2>Standard Room booking</h2>
	   	
	    <br>대여 시작일 : ${param.start}
	    <br>대여 종료 날짜 : ${param.end}
	    <br>오피스 종류 : ${param.category}
	   
   		
 	 	<form name = "checkDetail" id="checkDetail" action="insertCont.do" method="POST">  
		
		<input type="hidden" id="start" name="start" value="${param.start}">
		<input type="hidden" id="end" name="end" value="${param.end}">
	    <input type="hidden" id="category" name="category" value="${param.category}">	   
	    <input type="hidden" id="roomId" name="roomId" value="${getId}">
	    
    <br><br><input type ="submit" name="check" value="결제하기" id="payReservation" onclick="test()"> 
    <input type="button" value="취소하기" onclick="history.back()">
   	 <div id="testArea"></div>
	 
	    <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
		<script src="js/reservationFunction.js"></script>
	</form>	
</body>

</html>