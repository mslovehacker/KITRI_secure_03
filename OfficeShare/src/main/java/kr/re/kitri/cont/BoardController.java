package kr.re.kitri.cont;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.re.kitri.dao.BoardDao;
import kr.re.kitri.domain.BoardBean;

public class BoardController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao manager = new BoardDao();
		BoardBean[] list = null;
		String page = null;
		HttpSession hs = request.getSession();
		String s_id = (String) hs.getAttribute("loginId");
		String s_role = (String) hs.getAttribute("loginRole");
		System.out.println(s_role);

		if (request.getParameter("id") == null) { // id 값이 없으면 리스트 출력
			// 전체 값 받아오기 실행
			list = manager.getAllBoard();
			page = "Board.jsp";

		} else {
			String id = request.getParameter("id"); // id 값이 있으면 해당 id의 페이지로

			// 관리자이거나, 아니면 본인 글 이면서, 비공개
			list = new BoardBean[1];
			list[0] = manager.getOneBoard(Integer.parseInt(id));
			boolean protect = list[0].getProtect();
			if (!protect) {
				// 공개 글이 공개일 시
				manager.hitBoard(Integer.parseInt(id));
				page = "getboard.jsp";
			} else {
				// 공개글이 아닐 시
				// admin이거나, 작성자 본인일 경우
				// System.out.println("작성자 ID DB값:" + list[0].getUserId());
				// System.out.println("작성자 ID Session 값:" + s_id);
				// 공개글이 아닐 시
				// admin이거나, 작성자 본인일 경우
				if (s_role != null) {
					if (s_role.equals("관리자") || s_id.equals(list[0].getUserId())) {
						manager.hitBoard(Integer.parseInt(id));
						page = "getboard.jsp";
					} else {
						page = "getboard_fail.jsp";
					}
				} else {
					page = "getboard_fail.jsp";
				}
			}
			// 그 외의
		}

		RequestDispatcher rd = request.getRequestDispatcher(page);

		// list -> Board.jsp에 전달해줄꺼임!
		request.setAttribute("LIST", list);

		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
