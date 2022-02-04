<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>글 상세</title>
    <link rel="stylesheet" href="JSP/nicepage.css" media="screen">
    <script class="u-script" type="text/javascript" src="JSP/jquery.js"></script>
    <script class="u-script" type="text/javascript" src="JSP/nicepage.js"></script>    
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    <link id="u-page-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i">
    
    

  </head>
  <body class="u-body"><header class="u-clearfix u-gradient u-header u-header" id="sec-8385">
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
    <section class="u-align-center u-clearfix u-section-1" id="sec-5fbe">
      <form action="boardInsert.do" method="POST" class="u-clearfix u-form-spacing-0 u-form-vertical u-inner-form" style="padding: 0;">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h1 class="u-align-left u-text u-title u-text-1">글 작성 페이지</h1>
        <p class="u-align-left u-text u-text-2">&nbsp;</p>
        
        <div class="u-form u-form-1">
          
			공개&nbsp;&nbsp;<input type="radio" name="protect" value="false" required>&nbsp;&nbsp;&nbsp;&nbsp;비공개&nbsp;&nbsp;<input type="radio" name="protect" value="true">
          
        </div>
        <div class="u-expanded-width u-table u-table-responsive u-table-1">
          <table class="u-table-entity u-table-entity-1">
            <colgroup>
              <col width="100%">
            </colgroup>
            <thead class="u-palette-2-light-1 u-table-header u-table-header-1">
              <tr style="height: 79px;">
                <th class="u-border-1 u-border-grey-50 u-table-cell u-table-cell-1"> 글 제목<input name="subject" size="50" maxlength="100"></th> 
               
              </tr>
               
            </thead>
            <tbody class="u-table-body">
              <tr style="height: 665px;">
                <td class="u-border-2 u-border-grey-40 u-table-cell"> &nbsp;글 내용&nbsp;<br><textarea name="content" cols="100" rows="25"></textarea></td>
                
              </tr>
            </tbody>
          </table>
        </div>        
        <input type="button" class="u-active-custom-color-7 u-border-2 u-border-black u-btn u-btn-round u-button-style u-hover-palette-1-light-1 u-palette-1-base u-radius-3 u-text-body-alt-color u-text-hover-white u-btn-2" value="완료" onclick="ins_board()">
        <script type="text/javascript">
        	function ins_board() {
        		var vform = document.forms[0];
        		vform.submit();
        	}
        </script>
      </div>
      </form>
    </section>
    
    

 
  </body>
</html>