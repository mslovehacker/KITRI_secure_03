package kr.re.kitri.cont;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kr.re.kitri.dao.UserDao;
import kr.re.kitri.domain.UserBean;
import kr.re.kitri.util.AlertUtil;
import kr.re.kitri.util.CheckSessionUtil;
import kr.re.kitri.util.StringToTimeUtil;

public class JoinActionController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String userId = (String)request.getSession().getAttribute("loginId");
		CheckSessionUtil.checkNoUserId(userId, response);
		UserDao userD = new UserDao();
		UserBean inputUserB = new UserBean();
		String url = "join.do";
		String alertMessage = "회원 가입에 실패하였습니다.";
		inputUserB.setId(request.getParameter("id"));
		inputUserB.setPw(request.getParameter("pw"));
		inputUserB.setName(request.getParameter("name"));
		inputUserB.setBirth(StringToTimeUtil.toDate(request.getParameter("birth")));
		inputUserB.setGender(request.getParameter("gender"));
		inputUserB.setPhone(request.getParameter("phone"));
		inputUserB.setEmail(request.getParameter("email"));
		inputUserB.setAddress(request.getParameter("address"));
		inputUserB.setField(request.getParameter("field"));
		int resultJoin = userD.insertUser(inputUserB);
		if(resultJoin==1) {
			alertMessage = inputUserB.getName()+"님 가입을 축하합니다!";
			url = "index.jsp";
		}
		AlertUtil.alertAndMovePage(response, alertMessage, url);
	}
}