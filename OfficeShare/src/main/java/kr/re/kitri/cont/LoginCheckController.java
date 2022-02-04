package kr.re.kitri.cont;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kr.re.kitri.dao.UserDao;
import kr.re.kitri.domain.UserBean;

public class LoginCheckController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			int returnValue = 0;
			UserDao userD = new UserDao();
			UserBean inputUserB = new UserBean();
			inputUserB.setId(request.getParameter("userId"));
			inputUserB.setPw(request.getParameter("userPw"));
			if(userD.searchId(inputUserB.getId())==1) {
				returnValue = userD.matchPw(inputUserB);
			}
			response.getWriter().write(Integer.toString(returnValue));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}