package kr.re.kitri.cont;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import kr.re.kitri.dao.UserDao;
import kr.re.kitri.domain.UserBean;
import kr.re.kitri.util.AlertUtil;
import kr.re.kitri.util.CheckSessionUtil;

public class LoginActionController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String sessionId = (String)request.getSession().getAttribute("loginId");
		CheckSessionUtil.checkNoUserId(sessionId, response);
		UserDao userD = new UserDao();
		String userId = request.getParameter("id");
		String url = "login.do";
		String alertMessage = "로그인에 실패하셨습니다.";
		
		UserBean userB = userD.getUser(userId);
		if(userB.getName()!=null) {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("loginId", userB.getId());
			httpSession.setAttribute("loginRole", userB.getRole());
			httpSession.setAttribute("loginName", userB.getName());
			url = "index.do";
			alertMessage = "Welcome "+userB.getName()+"!";
		}
		AlertUtil.alertAndMovePage(response, alertMessage, url);
	}

}
