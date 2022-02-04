var checkResult = true;

function countMatch(string, re) {
	var returnCount = 0;
	if(re.test(string)) {
		returnCount = string.match(re).length;
	}
	return returnCount;
}

function checkId() {
	var checkComponent = true;
	var returnString = "";
	var userInput = document.getElementById("id").value;
	var re1 = /^[a-zA-Z]+/g;
	var re2 = /^[\w]*$/g;
	var totalCountId = countMatch(userInput, /\S/g);
	if(!re1.test(userInput)) {
		returnString = "아이디는 영어로 시작해야합니다.";
		checkComponent = false;
	} else if(!re2.test(userInput)) {
		returnString = "아이디에는 영어 대소문자, 숫자, 특수문자 _만 사용해야합니다.";
		checkComponent = false;
	} else if(totalCountId<5 || totalCountId>13) {
		returnString = "아이디는 5-13자여야합니다.";
		checkComponent = false;
	}
	if(!checkComponent) {
		checkResult = checkComponent;
	}
	return returnString;
}

function searchId() {
	var returnString = "";
	var userInput = document.getElementById("id").value;
	$.ajax({
		type: 'POST',
		url: 'joinCheck.do',
		data: {userId: userInput},
		async: false,
		success: function(result) {
			if(result>0) {
				returnString = "이미 사용 중인 아이디입니다.";
				checkResult = false;
			}
		}, error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("There is an error : method(group)에 에러가 있습니다.");
		}
	})
	return returnString;
}

function searchIdMatchPw(pw) {
	var userInput1 = document.getElementById("id").value;
	var userInput2 = document.getElementById(pw).value;
	$.ajax({
		type: 'POST',
		url: 'loginCheck.do',
		data: {userId: userInput1
			 , userPw: userInput2},
		async: false,
		success: function(result) {
			if(result==0) {
				checkResult = false;
			}
		}, error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("There is an error : method(group)에 에러가 있습니다.");
		}
	})
}

function checkPw(pw) {
	var checkComponent = true;
	var returnString = "";
	var userInput = document.getElementById(pw).value;
	var re1 = /^[a-zA-Z]+/g;
	var re2 = /^[\w]*$/g;
	var alphabetCount = countMatch(userInput, /[a-zA-Z]{1}/g);
	var digitCount = countMatch(userInput, /\d/g);
	var specialCount = countMatch(userInput, /[!@#$%^&*_]{1}/g);
	var totalCount = countMatch(userInput, /\S/g);
	if(totalCount!=alphabetCount+digitCount+specialCount) {
		returnString = "비밀번호에는 영어 대소문자, 숫자, 특수문자(!, @, #, $, %, ^, &, *, _)만 사용해야합니다.";
		checkComponent = false;
	} else if(alphabetCount<1 || digitCount<1 || specialCount<1) {
		returnString = "비밀번호에는 영어 대소문자, 숫자, 특수문자를 적어도 한 번 이상 사용해야합니다.";
		checkComponent = false;
	} else if(totalCount<8 || totalCount>18) {
		returnString = "비밀번호는 8-18자여야합니다.";
		checkComponent = false;
	}
	if(!checkComponent) {
		checkResult = checkComponent;
	}
	return returnString;
}

function matchPw(pw1, pw2) {
	var checkComponent = true;
	var returnString = "";
	var userInput1 = document.getElementById(pw1).value;
	var userInput2 = document.getElementById(pw2).value;
	if(userInput1!=userInput2) {
		returnString = "비밀번호가 일치하지 않습니다.";
		checkComponent = false;
	}
	if(!checkComponent) {
		document.getElementById(pw2+"Caution").textContent = returnString;
		checkResult = checkComponent;
	}
}

function checkName() {
	var checkComponent = true;
	var returnString = "";
	var userInput = document.getElementById("name").value;
	var englishCount = countMatch(userInput, /[a-zA-Z]{1}/g);
	var koreanCount = countMatch(userInput, /[가-힣]{1}/g);
	var totalCount = countMatch(userInput, /\S/g);
	if(englishCount!=totalCount && koreanCount!=totalCount) {
		returnString = "이름은 한글 혹은 영어로만 이루어져있어야합니다.";
		checkComponent = false;
	} else if(totalCount<3 || totalCount>18) {
		returnString = "이름은 3-18byte여야합니다.";
		checkComponent = false;
	}
	if(!checkComponent) {
		document.getElementById("nameCaution").textContent = returnString;
		checkResult = checkComponent;
	}
}

function checkBirth() {
	//JYJ: Block under 14
}

function checkPhone() {
	var checkComponent = true;
	var returnString = "";
	var userInput = document.getElementById("phone").value;
	var re1 = /^01(?:0|1|[6-9])-(?:\d{3}|\d{4})-\d{4}$/g;
	if(!re1.test(userInput)) {
		returnString = "전화번호는 01d-dddd-dddd 형식이어야합니다.";
		checkComponent = false;
	}
	if(!checkComponent) {
		document.getElementById("phoneCaution").textContent = returnString;
		checkResult = checkComponent;
	}
}

function checkEmail() {
	var checkComponent = true;
	var returnString = "";
	var userInput = document.getElementById("email").value;
	var re1 = /^([\w]+)@([a-z]+.[a-z.]+)$/g;
	if(!re1.test(userInput)) {
		returnString = "올바른 형식의 이메일을 입력해야합니다.";
		checkComponent = false;
	}
	if(!checkComponent) {
		document.getElementById("emailCaution").textContent = returnString;
		checkResult = checkComponent;
	}
}

function replaceNull() {
	var userInput1 = document.getElementById("address");
	var userInput2 = document.getElementById("field");
	if(userInput1.value==null) {
		userInput1.value = "-"
	}
	if(userInput2.value==null) {
		userInput2.value = "-"
	}
}

function replacePwNull(pw, pw1) {
	var userInput1 = document.getElementById(pw);
	var userInput2 = document.getElementById(pw1);
	if(userInput2.value=="") {
		userInput2.value = userInput1.value
	}
}


function login() {
	checkResult = true;
	checkId();
	if(checkResult) {
		checkPw("pw");
		if(checkResult) {
			searchIdMatchPw("pw");
		}
	}
	if(checkResult) {
		document.getElementById("loginForm").submit();
	} else {
		document.getElementById("loginCaution").textContent = "아이디가 존재하지 않거나 잘못된 비밀번호를 입력하셨습니다.";
	}
}

function join() {
	checkResult = true;
	var returnId="";
	var returnPw="";
	returnId = checkId();
	if(checkResult) {
		returnId = searchId();
	}
	if(returnId!=null) {
		document.getElementById("idCaution").textContent = returnId;
	}
	returnPw = checkPw("pw");
	if(returnPw!=null) {
		document.getElementById("pwCaution").textContent = returnPw;
	}
	matchPw("pw", "pw2");
	checkName();
	checkBirth();
	checkPhone();
	checkEmail();
	if(checkResult) {
		replaceNull();
		document.getElementById("joinForm").submit();
	}
}

function change() {
	checkResult = true;
	var returnPw="";
	var returnPw1="";
	checkPw("pw");
	if(checkResult) {
		searchIdMatchPw("pw");
	}
	if(!checkResult) {
		document.getElementById("pwCaution").textContent = "잘못된 비밀번호를 입력하셨습니다.";
	}
	if(document.getElementById("pw1").value!=""){
		returnPw1 = checkPw("pw1");
		if(returnPw1!=null) {
			document.getElementById("pw1Caution").textContent = returnPw1;
		}
		matchPw("pw1", "pw2");
	}
	checkName();
	checkBirth();
	checkPhone();
	checkEmail();
	if(checkResult) {
		replaceNull();
		replacePwNull("pw", "pw1");
		document.getElementById("changeForm").submit();
	}
}

function deleteUser() {
	checkResult = true;
	if(document.getElementById("sessionId").value==document.getElementById("id").value){
		checkId();
		if(checkResult){
			checkPw("pw");
			if(checkResult) {
				searchIdMatchPw("pw");
			}
		}
	} else {
		checkResult = false;
	}
	if(checkResult) {
		document.getElementById("deleteForm").submit();
	} else {
		document.getElementById("deleteCaution").textContent = "잘못된 아이디나 비밀번호를 입력하셨습니다.";
	}
}