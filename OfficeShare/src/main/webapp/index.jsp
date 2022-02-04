<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html style="font-size: 16px;">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="utf-8">
<meta name="keywords"
	content="HOME&nbsp;IS&nbsp;WHERE YOUR IS, Biggest First-Time Home Buyer Mistakes, About Us, for rent, Miscalculating the Full Costs of Buying, Contact Us">
<meta name="description" content="">
<meta name="robots" content="noindex">
<meta name="page_type" content="np-template-header-footer-from-plugin">
<title>Home</title>
<link rel="stylesheet" href="nicepage.css" media="screen">
<link rel="stylesheet" href="Home.css" media="screen">
<script class="u-script" type="text/javascript" src="jquery.js"></script>
<script class="u-script" type="text/javascript" src="nicepage.js"></script>
<script src="../js/userRestriction.js"></script>
<meta name="generator" content="Nicepage 3.21.3, nicepage.com">

<link id="u-theme-google-font" rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
<link id="u-page-google-font" rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i">











<script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "WebSite520589",
		"sameAs": []
}</script>
<meta name="theme-color" content="#38817a">
<meta property="og:title" content="Home">
<meta property="og:description" content="">
<meta property="og:type" content="website">
</head>
<body class="u-body u-overlap u-overlap-contrast u-palette-1-base">
	<header class="u-clearfix u-gradient u-header u-header" id="sec-8385">
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
	<section
		class="u-align-center u-clearfix u-image u-shading u-section-1"
		data-image-width="1152" data-image-height="864" id="qq">
		<div class="u-clearfix u-sheet u-sheet-1">
			<div class="u-clearfix u-layout-wrap u-layout-wrap-1">
				<div class="u-layout">
					<div class="u-layout-row">
						<div
							class="u-container-style u-layout-cell u-size-30 u-layout-cell-1">
							<div
								class="u-container-layout u-valign-middle-lg u-valign-middle-md u-valign-middle-sm u-valign-middle-xs u-container-layout-1">
								<h1 class="u-custom-font u-text u-text-1">ShareOffice</h1>
								<h2><p class="u-text u-text-2"> 공유오피스는<br/>
		우리 회사만을 위한 독립 공간과<br/>
		다른 회사와 함께 쓰는 공용 공간이<br/>
		 결합된 새로운 오피스입니다 </p></h2>
							</div>
						</div>
						<div
							class="u-align-left u-container-style u-layout-cell u-size-30 u-layout-cell-2">
							<div
								class="u-container-layout u-valign-middle-lg u-valign-middle-md u-valign-middle-sm u-valign-middle-xs u-container-layout-2">
								<div
									class="u-container-style u-gradient u-group u-radius-50 u-shape-round u-group-1">
									<div class="u-container-layout u-container-layout-3">
										<span class="u-icon u-icon-circle u-icon-1"><svg
												class="u-svg-link" preserveAspectRatio="xMidYMin slice"
												viewBox="0 0 53 53" style="">
												<use xmlns:xlink="http://www.w3.org/1999/xlink"
													xlink:href="#svg-23cd"></use></svg>
											<svg class="u-svg-content" viewBox="0 0 53 53" x="0px"
												y="0px" id="svg-23cd"
												style="enable-background: new 0 0 53 53;">
												<path style="fill:#E7ECED;"
													d="M18.613,41.552l-7.907,4.313c-0.464,0.253-0.881,0.564-1.269,0.903C14.047,50.655,19.998,53,26.5,53
	c6.454,0,12.367-2.31,16.964-6.144c-0.424-0.358-0.884-0.68-1.394-0.934l-8.467-4.233c-1.094-0.547-1.785-1.665-1.785-2.888v-3.322
	c0.238-0.271,0.51-0.619,0.801-1.03c1.154-1.63,2.027-3.423,2.632-5.304c1.086-0.335,1.886-1.338,1.886-2.53v-3.546
	c0-0.78-0.347-1.477-0.886-1.965v-5.126c0,0,1.053-7.977-9.75-7.977s-9.75,7.977-9.75,7.977v5.126
	c-0.54,0.488-0.886,1.185-0.886,1.965v3.546c0,0.934,0.491,1.756,1.226,2.231c0.886,3.857,3.206,6.633,3.206,6.633v3.24
	C20.296,39.899,19.65,40.986,18.613,41.552z"></path>
												<g>
												<path style="fill:#556080;"
													d="M26.953,0.004C12.32-0.246,0.254,11.414,0.004,26.047C-0.138,34.344,3.56,41.801,9.448,46.76
		c0.385-0.336,0.798-0.644,1.257-0.894l7.907-4.313c1.037-0.566,1.683-1.653,1.683-2.835v-3.24c0,0-2.321-2.776-3.206-6.633
		c-0.734-0.475-1.226-1.296-1.226-2.231v-3.546c0-0.78,0.347-1.477,0.886-1.965v-5.126c0,0-1.053-7.977,9.75-7.977
		s9.75,7.977,9.75,7.977v5.126c0.54,0.488,0.886,1.185,0.886,1.965v3.546c0,1.192-0.8,2.195-1.886,2.53
		c-0.605,1.881-1.478,3.674-2.632,5.304c-0.291,0.411-0.563,0.759-0.801,1.03V38.8c0,1.223,0.691,2.342,1.785,2.888l8.467,4.233
		c0.508,0.254,0.967,0.575,1.39,0.932c5.71-4.762,9.399-11.882,9.536-19.9C53.246,12.32,41.587,0.254,26.953,0.004z"></path>
</g></svg></span>
										<div class="u-expanded-width u-form u-login-control u-form-1">
											<c:choose>
												<c:when test="${loginId eq null}">
													<h3 class="u-align-center u-text u-text-default u-text-3">User
														Login</h3>
													<form action="loginAction.do" id="loginForm"
														method="POST"
														class="u-clearfix u-form-custom-backend u-form-spacing-30 u-form-vertical u-inner-form"
														source="custom" name="form-3" style="padding: 10px;">
														<div class="u-form-group u-form-name">
															<label for="username-5b0a"
																class="u-form-control-hidden u-label"></label> <input
																type="text" placeholder="Enter your Username"
																id="id" name="id"
																class="u-border-2 u-border-white u-input u-input-rectangle u-radius-43 u-white"
																required="">
														</div>
														<div class="u-form-group u-form-password">
															<label for="password-5b0a"
																class="u-form-control-hidden u-label"></label> <input
																type="password" placeholder="Enter your Password"
																id="pw" name="pw"
																class="u-border-2 u-border-white u-input u-input-rectangle u-radius-43 u-white"
																required="">
														</div>
														<!--  
                          <div class="u-form-checkbox u-form-group">
                            <input type="checkbox" id="checkbox-5b0a" name="remember" value="On">
                            <label for="checkbox-5b0a" class="u-label">Remember me</label>
                          </div>
                          -->
														<div class="u-align-left u-form-group u-form-submit">
														<div id="loginCaution"></div>
														<input type="button" class="u-border-none u-btn u-btn-round u-btn-submit u-button-style u-radius-50 u-btn-1" value="Login" onclick="login()">
														</div>
														<input type="hidden" value="" name="recaptchaResponse">
													</form>
													<a href="join.do"
														class="u-border-1 u-border-active-palette-2-base u-border-hover-palette-1-base u-btn u-button-style u-login-control u-login-forgot-password u-none u-text-body-alt-color u-btn-2">Join</a>
													<a href=""
														class="u-border-1 u-border-active-palette-2-base u-border-hover-palette-1-base u-btn u-button-style u-login-control u-login-forgot-password u-none u-text-palette-2-light-3 u-btn-3">Forgot
														password?</a>
												</c:when>
												<c:otherwise>
													<h3 class="u-align-center u-text u-text-default u-text-3">${loginId}[${loginName}(${loginRole})]님
														<br>환영합니다.</h3>
													<form action="logout.do" id="loginForm"
														method="POST"
														class="u-clearfix u-form-custom-backend u-form-spacing-30 u-form-vertical u-inner-form"
														source="custom" name="form-3" style="padding: 10px;">
														<div class="u-align-left u-form-group u-form-submit">
															<a href="#"
																class="u-border-none u-btn u-btn-round u-btn-submit u-button-style u-radius-50 u-btn-1">Logout</a>
															<input type="submit" value="submit"
																class="u-form-control-hidden">
														</div>
													</form>
													<a href="userInformation.do"
														class="u-border-1 u-border-active-palette-2-base u-border-hover-palette-1-base u-btn u-button-style u-login-control u-login-forgot-password u-none u-text-body-alt-color u-btn-2">MyPage</a>																										
												</c:otherwise>
											</c:choose>


										</div>

									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="u-align-center u-clearfix u-gradient u-section-2" id="sec-db08">
      <div class="u-clearfix u-sheet u-valign-bottom u-sheet-1">
        <h1 class="u-align-left u-text u-text-default u-text-grey-5 u-text-1">
          <span class="u-text-black"></span>
        </h1>
      </div>
    </section>
	<section class="u-align-center u-clearfix u-gradient u-section-2" id="sec-db08">
      <div class="u-clearfix u-sheet u-valign-bottom u-sheet-1">
        <h1 class="u-align-left u-text u-text-default u-text-grey-5 u-text-1">
          <span class="u-text-black"></span>
        </h1>
      </div>
    </section>
	 <section class="u-align-center u-clearfix u-palette-2-light-3 u-section-3" id="carousel_b58d">
      <div class="u-align-left u-container-style u-group u-shape-rectangle u-group-1">
       <h1> <div class="u-container-layout u-container-layout-1">공유오피스는 우리 회사만을 위한 독립 공간과<br/>
	다른 회사와 함께 쓰는 공용 공간이 결합된 새로운 오피스입니다.<br/></h1>
          <h2 class="u-custom-font u-text u-text-1">  
          </h2>
        </div>
      </div>
      
     
        <div class="u-layout">
          <div class="u-layout-row">
            <div class="u-align-center u-container-style u-layout-cell  u-size-15 u-size-30-md u-layout-cell-1" data-animation-name="slideIn" data-animation-duration="500" data-animation-delay="0" data-animation-direction="Down">
              <div class="u-border-10 u-border-grey-50 u-container-layout u-valign-top u-container-layout-2">
                <h3 class="u-text u-text-3">예약하기</h3>
                <img src="https://www.sisajournal.com/news/photo/202006/201747_107462_3210.jpg">
               
               <h4> <p class="u-align-center u-text u-text-2"> -Alone Room (1인실)<br/>-standard Room (2~4인실)<br/>-Delux Room (5~6인실)<br/>-King Room (8인실)<br/><br/> 1개월   3개월   6개월 </p></h4>
              </div>
            </div>
            <div class="u-align-center u-container-style u-layout-cell  u-size-15 u-size-30-md u-layout-cell-2" data-animation-name="slideIn" data-animation-duration="500" data-animation-delay="0" data-animation-direction="Down">
              <div class="u-border-10 u-border-grey-50 u-container-layout u-valign-top u-container-layout-2">
                <h3 class="u-text u-text-3">대여하기</h3>
                <img src ="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGnBkoeymeQo3BbCaNC-FgOs8SGS3Kui-Z3Q&usqp=CAU">
               <h4> <p class="u-align-center u-text u-text-2">-노트북 (그램&맥북)<br/>-빔프로젝터 <br/>-타블렛 <br/>-무선마우스<br/>-간이용침대<br/>-화이트보드<br/>-무선마이크 </p></h4>
              </div>
            </div>
            <div class="u-align-center u-container-style u-layout-cell  u-size-15 u-size-30-md u-layout-cell-3" data-animation-name="slideIn" data-animation-duration="500" data-animation-delay="0" data-animation-direction="Down">
              <div class="u-border-10 u-border-grey-50 u-container-layout u-valign-top u-container-layout-2">
                <h3 class="u-text u-text-3">오피스 소개</h3>
                 <img src="https://s3.us-east-1.amazonaws.com/co-assets/assets/image-transforms/images/59189/Etsy_c-Garrett-Rowland_-courtesy-of-Gensler_d88e4f0344a8f3f0bf6d644a30195abc.jpg">
               <h4> <p class="u-align-center u-text u-text-2">-다양한 방 구성<br/>-대여가능한 최신식 오피스 장비<br/>-넓은 휴식공간<br/>-깔끔한 인테리어<br/>-회의에 적당한 공간 및 시설 </p></h4>
              </div>
            </div>
            <div class="u-align-center u-container-style u-layout-cell  u-size-15 u-size-30-md u-layout-cell-4" data-animation-name="slideIn" data-animation-duration="500" data-animation-delay="0" data-animation-direction="Down">
              <div class="u-border-10 u-border-grey-50 u-container-layout u-valign-top u-container-layout-2">
                <h3 class="u-text u-text-3">게시판</h3>
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOxXG3FKqAtEZcvy5jKWXGbbsTpbS5LcH2QA&usqp=CAU">
              <h4>  <p class="u-align-center u-text u-text-2">전화상담 및 문의사항은 게시판에 남겨주세요 </p></h4>
              </div>
            </div>
          </div>
        </div>


	    <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
	<script src="js/userRestriction.js"></script>
</body>
</html>