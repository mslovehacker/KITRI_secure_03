package kr.re.kitri.cont;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainController
 * JYJ: change to use properties after learning spring
 */
@WebServlet("/index.do")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String charset = null;
	HashMap<String, Controller> list = null;	

	@Override
	public void init(ServletConfig sc) throws ServletException {
		charset = sc.getInitParameter("charset");
		list = new HashMap<String, Controller>();
		list.put("/index.do", new HomePageController());
		list.put("/login.do", new LoginController());
		list.put("/loginCheck.do", new LoginCheckController());
		list.put("/loginAction.do", new LoginActionController());
		list.put("/join.do", new JoinController());
		list.put("/joinCheck.do", new JoinCheckController());
		list.put("/joinAction.do", new JoinActionController());
		list.put("/userInformation.do", new UserInformationController());
		list.put("/changeUserInformation.do", new ChangeUserController());
		list.put("/changeAction.do", new ChangeUserActionController());
		list.put("/deleteUser.do", new DeleteUserController());
		list.put("/deleteAction.do", new DeleteUserActionController());
		list.put("/logout.do", new LogoutController());
		list.put("/adminPage.do", new AdminHomePageController());
		list.put("/manageUser.do", new ManageUser());
		list.put("/board.do", new BoardController());
		list.put("/boardInsert.do", new BoardInsertController() );
		list.put("/boardModify.do", new BoardModifyController() );
		list.put("/boardDelete.do", new BoardDeleteController() );
		list.put("/insertCont.do", new ReserveController());
		list.put("/infoRoom.do", new InformationRoomController());
		list.put("/reserveSearchCont.do", new ReserveSearchController());
		list.put("/equipment.do", new EquipmentIntroductionController());
		list.put("/getRoomIdCont.do", new GetRoomIdController());
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		request.setCharacterEncoding(charset);
		String url = request.getRequestURI();
		String contextPath = request.getContextPath();
		String path = url.substring(contextPath.length());
		
		Controller subCon = list.get(path);
		System.out.println("요청 Path : " + path);
		subCon.execute(request, response);
	}
}