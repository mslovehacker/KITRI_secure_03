<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="Get a demo">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>회원 정보 수정</title>
    <link rel="stylesheet" href="nicepage.css" media="screen">
<link rel="stylesheet" href="Mypg.css" media="screen">
    <script class="u-script" type="text/javascript" src="jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="nicepage.js" defer=""></script>
    <meta name="generator" content="Nicepage 3.21.3, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    <link id="u-page-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i">
    
    
    <script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "WebSite520589",
		"sameAs": []
}</script>
    <meta name="theme-color" content="#38817a">
    <meta property="og:title" content="Mypg">
    <meta property="og:description" content="">
    <meta property="og:type" content="website">
  </head>
  <body class="u-body u-overlap"><header class="u-clearfix u-gradient u-header u-header" id="sec-8385">
		<div class="u-clearfix u-sheet u-sheet-1">
			<nav
				class="u-align-left u-menu u-menu-dropdown u-nav-spacing-25 u-offcanvas u-menu-1"
				data-responsive-from="MD" data-submenu-level="with-reload">
				<div class="menu-collapse u-custom-font u-font-raleway"
					style="letter-spacing: -3px; font-size: 1.125rem; text-transform: uppercase; font-weight: 700;">
					<a
						class="u-button-style u-custom-text-color u-custom-text-decoration u-custom-text-hover-color u-custom-text-shadow u-custom-text-shadow-blur u-custom-text-shadow-color u-custom-text-shadow-transparency u-custom-text-shadow-x u-custom-text-shadow-y u-nav-link"
						href="#" style="padding: 4px 0px; font-size: calc(1em + 8px);">
						<svg class="u-svg-link" preserveAspectRatio="xMidYMin slice"
							viewBox="0 0 302 302" style="">
							<use xmlns:xlink="http://www.w3.org/1999/xlink"
								xlink:href="#svg-7b92"></use></svg> <svg
							xmlns="http://www.w3.org/2000/svg"
							xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1"
							id="svg-7b92" x="0px" y="0px" viewBox="0 0 302 302"
							style="enable-background: new 0 0 302 302;" xml:space="preserve"
							class="u-svg-content">
							
							<rect y="36" width="302" height="30"></rect>
							<rect y="236" width="302" height="30"></rect>
							<rect y="136" width="302" height="30"></rect>

				
							</svg>
					</a>
				</div>
				<div class="u-custom-menu u-nav-container">
					<ul
						class="u-custom-font u-font-raleway u-nav u-spacing-25 u-unstyled u-nav-1">
						<li class="u-nav-item"><a
							class="u-button-style u-nav-link u-text-black u-text-hover-white"
							href="index.do" style="padding: 18px 14px;">Home</a></li>
						<li class="u-nav-item"><a
							class="u-button-style u-nav-link u-text-black u-text-hover-white"
							href="#" style="padding: 18px 14px;">service</a>
						<div class="u-nav-popup">
								<ul
									class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10 u-nav-2">
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link u-white"
										href="infoRoom.do">room</a></li>
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link u-white" href="equipment.do">equip</a>
									</li>
								</ul>
							</div></li>
						<li class="u-nav-item"><a
							class="u-button-style u-nav-link u-text-black u-text-hover-white"
							href="#" style="padding: 18px 14px;">reserve</a>
							<div class="u-nav-popup">
								<ul
									class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10 u-nav-2">
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link u-white"
										href="reserveRoomAlone.jsp">싱글룸</a></li>
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link u-white"
										href="reserveRoomStandard.jsp">스탠다드룸</a></li>
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link u-white"
										href="reserveRoomDelux.jsp">디럭스룸</a></li>
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link u-white"
										href="reserveRoomKing.jsp">킹룸</a></li>
								</ul>
							</div></li>
						<li class="u-nav-item"><a
							class="u-button-style u-nav-link u-text-black u-text-hover-white"
							href="board.do" style="padding: 18px 14px;">Board</a></li>





						<c:choose>
							<c:when test="${loginId eq null}">
								<li class="u-nav-item"><a
									class="u-button-style u-nav-link u-text-black u-text-hover-white"
									href="join.do" style="padding: 18px 14px;">join</a></li>

							</c:when>
														<c:when test="${loginRole eq '관리자'}">
								<li class="u-nav-item"><a
									class="u-button-style u-nav-link u-text-black u-text-hover-white"
									style="padding: 18px 14px;">Mypage</a>
								<div class="u-nav-popup">
										<ul
											class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10 u-nav-3">
											<li class="u-nav-item"><a
												class="u-button-style u-nav-link u-white" href="userInformation.do">mypg</a>
											</li>
											<li class="u-nav-item"><a
												class="u-button-style u-nav-link u-white" href="adminPage.do">admpg</a>
												</li>
												</ul>
												</div>
							</c:when>
							<c:otherwise>
								<li class="u-nav-item"><a
									class="u-button-style u-nav-link u-text-black u-text-hover-white"
									style="padding: 18px 14px;">Mypage</a>
								<div class="u-nav-popup">
										<ul
											class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10 u-nav-3">
											<li class="u-nav-item"><a
												class="u-button-style u-nav-link u-white" href="userInformation.do">mypg</a>
											</li>
											</ul>
											</div>
							</c:otherwise>
						</c:choose>
					</ul>
				</div>
		</div>
		<div class="u-custom-menu u-nav-container-collapse">
			<div
				class="u-align-center u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
				<div class="u-sidenav-overflow">
					<div class="u-menu-close u-menu-close-1"></div>
					<ul
						class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-4">
						<li class="u-nav-item"><a class="u-button-style u-nav-link"
							href="index.do" style="padding: 18px 14px;">Home</a></li>
						<li class="u-nav-item"><a class="u-button-style u-nav-link"
							href="#" style="padding: 18px 14px;">service</a>
						<div class="u-nav-popup">
								<ul
									class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10 u-nav-5">
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link" href="infoRoom.do">room</a></li>
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link" href="equipment.do">equip</a>
									</li>
								</ul>
							</div></li>
						<li class="u-nav-item"><a
							class="u-button-style u-nav-link u-text-black u-text-hover-white"
							href="#" style="padding: 18px 14px;">reserve</a>
							<div class="u-nav-popup">
								<ul
									class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10 u-nav-2">
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link u-white"
										href="reserveRoomAlone.jsp">싱글룸</a></li>
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link u-white"
										href="reserveRoomStandard.jsp">스탠다드룸</a></li>
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link u-white"
										href="reserveRoomDelux.jsp">디럭스룸</a></li>
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link u-white"
										href="reserveRoomKing.jsp">킹룸</a></li>
								</ul>
							</div></li>
							
						<li class="u-nav-item"><a class="u-button-style u-nav-link"
							href="Board.do" style="padding: 18px 14px;">Board</a>
							
						<c:choose>
							<c:when test="${loginId eq null}">
						<li class="u-nav-item"><a
							class="u-button-style u-nav-link" href="join.do"
							style="padding: 18px 14px;">join</a></li>
							</c:when>
							<c:when test="${loginRole eq '관리자'}">
						<li class="u-nav-item"><a class="u-button-style u-nav-link"
							style="padding: 18px 14px;">Mypage</a>
						<div class="u-nav-popup">
								<ul
									class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10 u-nav-6">
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link" href="userInformation.do">mypg</a></li>
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link" href="adminPage.do">admpg</a>
										</li>
								</ul>
							</div></li>
							</c:when>
							<c:otherwise>
													<li class="u-nav-item"><a class="u-button-style u-nav-link"
							style="padding: 18px 14px;">Mypage</a>
						<div class="u-nav-popup">
								<ul
									class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10 u-nav-6">
									<li class="u-nav-item"><a
										class="u-button-style u-nav-link" href="userInformation.do">mypg</a></li>
								</ul>
							</div></li>
							</c:otherwise>
							</c:choose>
							
					</ul>
				</div>
			</div>
			<div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
		</div>
		</nav>
		</div>
	</header>
    <section class="u-align-center u-clearfix u-gradient u-section-1" id="carousel_a193">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h2 class="u-text u-text-1">My Inf</h2>
        <div class="u-form u-form-1">
                <c:set var="user" value="${USER}"/>
          <form action="changeAction.do" id="changeForm" method="POST" class="u-clearfix u-form-spacing-0 u-form-vertical u-inner-form" style="padding: 0;" source="custom" name="form">      
            <div class="u-form-group u-form-group-1"><br/>
              
              
              <input type="text" id="id" name="id" value="${user.id}" disabled class="u-border-2 u-border-grey-75 u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle" required="required">
              <label for="text-ceff" class="u-label u-label-1">User Id</label>
              <input type="hidden" id="id" name="id" value="${user.id}" >
              <span id="idCaution" disabled class="u-border-2 u-border-grey-75 u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle">아이디는 변경할 수 없습니다.</span>
             
            </div>
            <div class="u-form-group u-form-name u-form-group-2">
              <label for="name-f2a8" class="u-label u-label-2">기존 비밀번호</label>
              <input type="password" placeholder="기존 비밀번호를 입력하세요..." id="pw" name="pw" class="u-border-2 u-border-grey-75 u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle" required="">
              <span id="pwCaution"></span>
            </div>
            <div class="u-form-group u-form-name u-form-group-2">
              <label for="name-f2a8" class="u-label u-label-2">새 비밀번호</label>
              <input type="password" placeholder="영어와 숫자를 모두 사용한 8-18자 이내의 비밀번호를 입력하세요..." id="pw1" name="pw1" class="u-border-2 u-border-grey-75 u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle" required="">
              <span id="pw1Caution"></span>
            </div>
            <div class="u-form-group u-form-name u-form-group-2">
              <label for="name-f2a8" class="u-label u-label-2">새 비밀번호 확인</label>
              <input type="password" placeholder="비밀번호를 다시 한 번 입력하세요..." id="pw2" name="pw2" class="u-border-2 u-border-grey-75 u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle" required="">
              <span id="pw2Caution"></span>
            </div>
            <div class="u-form-group u-form-name u-form-group-2">
              <label for="name-f2a8" class="u-label u-label-2">Name</label>
              <input type="text" id="name" name="name" value="${user.name}" class="u-border-2 u-border-grey-75 u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle" required="">
            </div>
            <div class="u-form-date u-form-group u-form-partition-factor-2 u-form-group-3">
              <label for="date-4441" class="u-label u-label-3">Date</label>
              <input type="date" id="birth" name="birth" value="${user.birth}" class="u-border-2 u-border-grey-75 u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle" required="">
            </div>
            <div class="u-form-group u-form-partition-factor-2 u-form-phone u-form-group-4">
              <label for="phone-447e" class="u-label u-label-4">Phone</label>
              <input type="tel" id="phone" name="phone" value="${user.phone}" class="u-border-2 u-border-grey-75 u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle" required="" pattern="000-0000-0000">
            </div>
            <div class="u-form-email u-form-group u-form-group-5">
              <label for="email-f2a8" class="u-label u-label-5">E-mail</label>
              <input type="email" id="email" name="email" value="${user.email}" class="u-border-2 u-border-grey-75 u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle" required="">
            </div>
            <div class="u-form-group u-form-select u-form-group-6">
              <label for="select-824f" class="u-label u-label-6">Gender</label>
              <br/>
              <input type="radio" name="gender" value="M" <c:if test="${user.gender=='M'}"> checked="checked" </c:if> required="required">남 
		        <input type="radio" name="gender" value="F" <c:if test="${user.gender=='F'}"> checked="checked" </c:if> >여 *<br/>
            <input disabled class="u-border-2 u-border-grey-75 u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle">
            </div>
            <div class="u-form-group u-form-group-7">
              <label for="text-a20a" class="u-label u-label-7">Field</label>
              <input type="text" id="field" name="field" value="${user.field}" class="u-border-2 u-border-grey-75 u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle">
            </div>
            <div class="u-form-address u-form-group u-form-group-8">
              <label for="address-481b" class="u-label u-label-8">Address</label>
              <input type="text" id="address" name="address" value="${user.address}" class="u-border-2 u-border-grey-75 u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle">
            </div>
            <div class="u-align-right u-form-group u-form-submit u-form-group-9">
              <a href="#" class="u-border-none u-btn u-btn-submit u-button-style u-none u-btn-1">
                <br>
              </a>
            </div>
            <div class="u-form-send-message u-form-send-success"> Thank you! Your message has been sent. </div>
            <div class="u-form-send-error u-form-send-message"> Unable to send your message. Please fix errors then try again. </div>
            <input type="hidden" value="" name="recaptchaResponse">
          
        </div>
        <input type="button" value="회원 정보 수정" class="u-border-none u-btn u-button-style u-btn-2" onclick="change()">
        </form>
      </div>
    </section>
    
    
    <footer class="u-align-center-md u-align-center-sm u-align-center-xs u-clearfix u-footer u-grey-80" id="sec-5874"><div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-align-center-lg u-align-center-md u-align-center-xl u-text u-text-1">Sample footer text</p>
        <div class="u-align-left u-social-icons u-spacing-10 u-social-icons-1">
          <a class="u-social-url" title="facebook" target="_blank" href=""><span class="u-icon u-social-facebook u-social-icon u-icon-1"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 112 112" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-decc"></use></svg><svg class="u-svg-content" viewBox="0 0 112 112" x="0" y="0" id="svg-decc"><circle fill="currentColor" cx="56.1" cy="56.1" r="55"></circle><path fill="#FFFFFF" d="M73.5,31.6h-9.1c-1.4,0-3.6,0.8-3.6,3.9v8.5h12.6L72,58.3H60.8v40.8H43.9V58.3h-8V43.9h8v-9.2
            c0-6.7,3.1-17,17-17h12.5v13.9H73.5z"></path></svg></span>
          </a>
          <a class="u-social-url" title="twitter" target="_blank" href=""><span class="u-icon u-social-icon u-social-twitter u-icon-2"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 112 112" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-cb9b"></use></svg><svg class="u-svg-content" viewBox="0 0 112 112" x="0" y="0" id="svg-cb9b"><circle fill="currentColor" class="st0" cx="56.1" cy="56.1" r="55"></circle><path fill="#FFFFFF" d="M83.8,47.3c0,0.6,0,1.2,0,1.7c0,17.7-13.5,38.2-38.2,38.2C38,87.2,31,85,25,81.2c1,0.1,2.1,0.2,3.2,0.2
            c6.3,0,12.1-2.1,16.7-5.7c-5.9-0.1-10.8-4-12.5-9.3c0.8,0.2,1.7,0.2,2.5,0.2c1.2,0,2.4-0.2,3.5-0.5c-6.1-1.2-10.8-6.7-10.8-13.1
            c0-0.1,0-0.1,0-0.2c1.8,1,3.9,1.6,6.1,1.7c-3.6-2.4-6-6.5-6-11.2c0-2.5,0.7-4.8,1.8-6.7c6.6,8.1,16.5,13.5,27.6,14
            c-0.2-1-0.3-2-0.3-3.1c0-7.4,6-13.4,13.4-13.4c3.9,0,7.3,1.6,9.8,4.2c3.1-0.6,5.9-1.7,8.5-3.3c-1,3.1-3.1,5.8-5.9,7.4
            c2.7-0.3,5.3-1,7.7-2.1C88.7,43,86.4,45.4,83.8,47.3z"></path></svg></span>
          </a>
          <a class="u-social-url" title="instagram" target="_blank" href=""><span class="u-icon u-social-icon u-social-instagram u-icon-3"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 112 112" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-4523"></use></svg><svg class="u-svg-content" viewBox="0 0 112 112" x="0" y="0" id="svg-4523"><circle fill="currentColor" cx="56.1" cy="56.1" r="55"></circle><path fill="#FFFFFF" d="M55.9,38.2c-9.9,0-17.9,8-17.9,17.9C38,66,46,74,55.9,74c9.9,0,17.9-8,17.9-17.9C73.8,46.2,65.8,38.2,55.9,38.2
            z M55.9,66.4c-5.7,0-10.3-4.6-10.3-10.3c-0.1-5.7,4.6-10.3,10.3-10.3c5.7,0,10.3,4.6,10.3,10.3C66.2,61.8,61.6,66.4,55.9,66.4z"></path><path fill="#FFFFFF" d="M74.3,33.5c-2.3,0-4.2,1.9-4.2,4.2s1.9,4.2,4.2,4.2s4.2-1.9,4.2-4.2S76.6,33.5,74.3,33.5z"></path><path fill="#FFFFFF" d="M73.1,21.3H38.6c-9.7,0-17.5,7.9-17.5,17.5v34.5c0,9.7,7.9,17.6,17.5,17.6h34.5c9.7,0,17.5-7.9,17.5-17.5V38.8
            C90.6,29.1,82.7,21.3,73.1,21.3z M83,73.3c0,5.5-4.5,9.9-9.9,9.9H38.6c-5.5,0-9.9-4.5-9.9-9.9V38.8c0-5.5,4.5-9.9,9.9-9.9h34.5
            c5.5,0,9.9,4.5,9.9,9.9V73.3z"></path></svg></span>
          </a>
          <a class="u-social-url" title="linkedin" target="_blank" href=""><span class="u-icon u-social-icon u-social-linkedin u-icon-4"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 112 112" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-3783"></use></svg><svg class="u-svg-content" viewBox="0 0 112 112" x="0" y="0" id="svg-3783"><circle fill="currentColor" cx="56.1" cy="56.1" r="55"></circle><path fill="#FFFFFF" d="M41.3,83.7H27.9V43.4h13.4V83.7z M34.6,37.9L34.6,37.9c-4.6,0-7.5-3.1-7.5-7c0-4,3-7,7.6-7s7.4,3,7.5,7
            C42.2,34.8,39.2,37.9,34.6,37.9z M89.6,83.7H76.2V62.2c0-5.4-1.9-9.1-6.8-9.1c-3.7,0-5.9,2.5-6.9,4.9c-0.4,0.9-0.4,2.1-0.4,3.3v22.5
            H48.7c0,0,0.2-36.5,0-40.3h13.4v5.7c1.8-2.7,5-6.7,12.1-6.7c8.8,0,15.4,5.8,15.4,18.1V83.7z"></path></svg></span>
          </a>
        </div>
      </div></footer>
    <section class="u-backlink u-clearfix u-grey-80">
      <a class="u-link" href="https://nicepage.com/website-templates" target="_blank">
        <span>Website Templates</span>
      </a>
      <p class="u-text">
        <span>created with</span>
      </p>
      <a class="u-link" href="https://nicepage.com/static-site-generator" target="_blank">
        <span>Static Website Generator</span>
      </a>. 
    </section>
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
	<script src="js/userRestriction.js"></script>
  </body>
</html>