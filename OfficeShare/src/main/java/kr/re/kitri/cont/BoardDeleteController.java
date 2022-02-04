package kr.re.kitri.cont;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.re.kitri.dao.BoardDao;

public class BoardDeleteController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String code = null;

		System.out.println("보드 삭제 컨트롤러 실행");

		// 수정할 수 있는 페이지로 호출하여 코드 수정될 수 있도록 구성함

		BoardDao dao = new BoardDao();
		String id = request.getParameter("id");
		int cnt = dao.deleteBoard(Integer.parseInt(id));

		// RequestDispatcher rd = request.getRequestDispatcher("board.do");
		try {
			response.sendRedirect("board.do");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
