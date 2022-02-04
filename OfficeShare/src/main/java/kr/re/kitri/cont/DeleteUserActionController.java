package kr.re.kitri.cont;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import kr.re.kitri.dao.UserDao;
import kr.re.kitri.util.AlertUtil;
import kr.re.kitri.util.CheckSessionUtil;

public class DeleteUserActionController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession httpSession = request.getSession();
		String userId = (String)httpSession.getAttribute("loginId");
		String userName = (String)httpSession.getAttribute("loginName");
		CheckSessionUtil.checkHasUserId(userId, response);
		UserDao userD = new UserDao();
		String url = "deleteUser.do";
		String alertMessage = "회원 탈퇴에 실패하였습니다.";
		int resultChange = userD.deleteUser(userId);
		if(resultChange==1) {
			alertMessage = userName+"님이 회원 탈퇴하였습니다.";
			httpSession.invalidate();
			url = "index.do";
		}
		AlertUtil.alertAndMovePage(response, alertMessage, url);
	}

}
