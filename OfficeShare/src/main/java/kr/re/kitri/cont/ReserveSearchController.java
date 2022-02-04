package kr.re.kitri.cont;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.re.kitri.dao.ReserveRoomDao;
import kr.re.kitri.domain.ReserveRoomBean;

/**
 * Search non-reserved room
 * 
 * @author kitri
 *
 */
@WebServlet("/reserveSearchCont.do")
public class ReserveSearchController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		ReserveRoomDao rrd = new ReserveRoomDao();
		String category = request.getParameter("category");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		int count = 0;
		String returnString = "";
		int result_cnt = 0;

		List<ReserveRoomBean> rrb = rrd.getSelected(start, end, category);
		System.out.println("size 실행 확인");
		for (int i = 0; i < rrb.size(); i++) {
			count += i;
			if (count <= 0) {
				returnString = "예약가능";
				result_cnt = 0;
			}
			else {
				returnString = "현재 조회한 사무실은 해당 날짜에 예약이 불가합니다.";
				result_cnt = 1;
			} 		

			// request.setAttribute("returnString", returnString);

		}
		
		try {
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			System.out.println("returnString : " + result_cnt);
			response.getWriter().write(Integer.toString(result_cnt));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}