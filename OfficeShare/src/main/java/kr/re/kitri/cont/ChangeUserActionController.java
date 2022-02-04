package kr.re.kitri.cont;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kr.re.kitri.dao.UserDao;
import kr.re.kitri.domain.UserBean;
import kr.re.kitri.util.AlertUtil;
import kr.re.kitri.util.CheckSessionUtil;
import kr.re.kitri.util.StringToTimeUtil;

public class ChangeUserActionController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String userId = (String)request.getSession().getAttribute("loginId");
		CheckSessionUtil.checkHasUserId(userId, response);
		UserDao userD = new UserDao();
		UserBean inputUserB = new UserBean();
		String url = "changeUserInformation.do";
		String alertMessage = "회원 정보 수정에 실패하였습니다.";
		inputUserB.setId(request.getParameter("id"));
		inputUserB.setPw(request.getParameter("pw1"));
		inputUserB.setName(request.getParameter("name"));
		inputUserB.setBirth(StringToTimeUtil.toDate(request.getParameter("birth")));
		inputUserB.setGender(request.getParameter("gender"));
		inputUserB.setPhone(request.getParameter("phone"));
		inputUserB.setEmail(request.getParameter("email"));
		inputUserB.setAddress(request.getParameter("address"));
		inputUserB.setField(request.getParameter("field"));
		int resultChange = userD.modifyUser(inputUserB);
		if(resultChange==1) {
			alertMessage = inputUserB.getName()+"님 회원 정보를 수정하였습니다.";
			url = "userInformation.do";
		}
		AlertUtil.alertAndMovePage(response, alertMessage, url);
	}
}
