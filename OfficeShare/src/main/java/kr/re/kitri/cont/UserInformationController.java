package kr.re.kitri.cont;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kr.re.kitri.dao.UserDao;
import kr.re.kitri.domain.UserBean;
import kr.re.kitri.util.CheckSessionUtil;

public class UserInformationController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String userId = (String)request.getSession().getAttribute("loginId");
		CheckSessionUtil.checkHasUserId(userId, response);
		UserDao userD = new UserDao();
		UserBean userB = userD.getUser(userId, true);
		request.setAttribute("USER", userB);
		RequestDispatcher rd = request.getRequestDispatcher("/userInformation.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
