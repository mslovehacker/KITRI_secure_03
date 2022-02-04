package kr.re.kitri.cont;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.re.kitri.util.AlertUtil;

public class LogoutController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession httpSession = request.getSession();
		httpSession.invalidate();
		AlertUtil.alertAndMovePage(response, "로그아웃했습니다.", "index.do");
	}
}
