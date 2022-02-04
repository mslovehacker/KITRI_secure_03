package kr.re.kitri.cont;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.re.kitri.dao.ReserveRoomDao;
import kr.re.kitri.domain.ReserveRoomBean;
import kr.re.kitri.domain.RoomBean;
/**insert reservation to DataBase 
 * 
 * @author kitri
 *
 */
@WebServlet("/getRoomIdCont.do")
public class GetRoomIdController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String category = request.getParameter("category");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		int getId = 0;
		
		
		ReserveRoomDao rrd = new ReserveRoomDao();
		System.out.println(start +"   " +end + "    " + category);
		List<RoomBean> list = rrd.getRoomId(start, end, category);
		getId = list.get(0).getId();
		
		
		System.out.println(getId);
		
		request.setAttribute("getId", getId);
		

		
		RequestDispatcher rd = request.getRequestDispatcher("confirmDetail.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	/*	request.setAttribute("LIST", list);
		RequestDispatcher rd = request.getRequestDispatcher("confirmDetail.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	
	}
}