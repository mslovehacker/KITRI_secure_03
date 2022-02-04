package kr.re.kitri.cont;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kr.re.kitri.util.CheckSessionUtil;

public class AdminHomePageController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String userRole = (String)request.getSession().getAttribute("loginRole");
		CheckSessionUtil.checkHasUserId(userRole, response);
		try {
			response.sendRedirect("adminPage.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
