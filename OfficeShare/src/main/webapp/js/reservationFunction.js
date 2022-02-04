function stringToDate(inputString) {
	splitString = inputString.split('-');
	outputDate = new Date(splitString[0], splitString[1]-1, splitString[2]);
	return outputDate;
}

function DateToString(inputDate) {
	var year = inputDate.getFullYear();
	var month = inputDate.getMonth()+1;
	month = month>=10?month:"0"+month;
	var day = inputDate.getDate();
	day = day>=10?day:"0"+day;
	outputString = year+"-"+month+"-"+day;
	return outputString;
}

function forSetDate(){
	document.getElementById("makeReservation").disabled= true;
}

function endingDate() {
	var term = document.querySelector('input[id="term"]:checked').value*1;
	startDate = document.getElementById("start");
	dateConvert = stringToDate(startDate.value);
	endDate = document.getElementById("end");
	dateConvert.setMonth(dateConvert.getMonth()+term);
	endDate.value = DateToString(dateConvert);
	
	document.getElementById("makeReservation").disabled= false;
}




function searchDate() {
	
	var returnString = "";
	var userInput1 = document.getElementById("start").value;
	var userInput2 = document.getElementById("end").value;
	var userInput3 = document.getElementById("category").value;
	//document.getElementById("testArea").textContent = userInput1;
	$.ajax({
		type: 'POST',
		url: 'reserveSearchCont.do',
		data: {start: userInput1,
			   end: userInput2,
			   category: userInput3,},
		async: false,
		success: function(result) {
			if(result>=1) { // result는 해당 콘트의 출력하는 텍스트!
				alert("죄송합니다, 지정하신 날짜에는 해당 사무실이 사용중입니다.");
				//returnString = "죄송합니다, 지정하신 날짜에는 해당 사무실이 사용중입니다.";
			} else {
		//		alert("예약가능");
				document.forms[0].submit();
				
			}
		}, error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("There is an error : method(group)에 에러가 있습니다.");
		}
	})
	//document.getElementById("testArea").textContent = returnString;
	return returnString;
}



