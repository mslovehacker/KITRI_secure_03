package kr.re.kitri.cont;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.re.kitri.dao.ReserveRoomDao;
import kr.re.kitri.domain.ReserveRoomBean;
/**insert reservation to DataBase 
 * 
 * @author kitri
 *
 */
@WebServlet("/insertCont.do")
public class ReserveController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String roomId = request.getParameter("roomId");
		String category = request.getParameter("category");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
				
		ReserveRoomBean rrb = new ReserveRoomBean();
		
		rrb.setRoomId(Integer.parseInt(roomId));
		rrb.setCategory(category);
		rrb.setStart(start);
		rrb.setEnd(end);
		
		
		ReserveRoomDao rrd = new ReserveRoomDao();
		int ins_result = rrd.insertReservation(rrb);
		System.out.println(ins_result);
		// 해당 결과에 대한 사이트 리디렉션(다른 페이지로 가기)
		try {
			response.sendRedirect("inforoom.jsp"); //일단 인덱스, 수정 예정.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}