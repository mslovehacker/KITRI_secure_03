package kr.re.kitri.cont;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.re.kitri.util.CheckSessionUtil;

public class JoinController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String userId = (String)request.getSession().getAttribute("loginId");
		CheckSessionUtil.checkNoUserId(userId, response);
		try {
			response.sendRedirect("join.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}