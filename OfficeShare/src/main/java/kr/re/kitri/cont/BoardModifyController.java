package kr.re.kitri.cont;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.re.kitri.dao.BoardDao;
import kr.re.kitri.domain.BoardBean;

public class BoardModifyController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String code = null;
		
		if(request.getParameter("code") == null) {
			try {
				response.sendRedirect("index.do");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			code = request.getParameter("code");
		}

		if (code.equals("modView")) {
			// 수정할 수 있는 페이지로 호출하여 코드 수정될 수 있도록 구성함
			BoardBean vo = new BoardBean();
			BoardDao dao = new BoardDao();
			String id = request.getParameter("id");
			vo = dao.getOneBoard(Integer.parseInt(id));
			
			request.setAttribute("LIST", vo);
			
			RequestDispatcher rd = request.getRequestDispatcher("editboard.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			


		} else if (code.equals("modOK")) {
			// 수정값 받을 것을 DB에 입력할 수 있도록 구성
			BoardBean vo = new BoardBean();
			BoardDao dao = new BoardDao();
			vo.setId(Integer.parseInt(request.getParameter("id")));
			vo.setSubject(request.getParameter("subject"));
			vo.setProtect(Boolean.parseBoolean(request.getParameter("protect")));
			vo.setContent(request.getParameter("content"));

			int id = Integer.parseInt(request.getParameter("id"));
			vo.setId(id);

			int resultInt = dao.updateBoard(vo);

			System.out.println("result: " + resultInt);

			try {
				response.sendRedirect("board.do?id=" + vo.getId());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("보드 수정 컨트롤러 실행");

	}

}
