package kr.re.kitri.cont;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kr.re.kitri.dao.UserDao;

public class JoinCheckController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			String userId = request.getParameter("userId");
			UserDao userD = new UserDao();
			response.getWriter().write(Integer.toString(userD.searchId(userId)));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
