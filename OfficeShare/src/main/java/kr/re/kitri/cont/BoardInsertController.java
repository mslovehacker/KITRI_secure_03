package kr.re.kitri.cont;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.re.kitri.dao.BoardDao;
import kr.re.kitri.domain.BoardBean;

public class BoardInsertController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession hs = request.getSession();  //고정시키기 위한 
	
		System.out.println("보드 추가 컨트롤러 실행");
		BoardBean vo = new BoardBean();
		BoardDao dao = new BoardDao();
		System.out.println("Request Protect : " + request.getParameter("protect"));
		vo.setUserId((String)hs.getAttribute("loginId")); //받아온 아이디 고정시킴 
		vo.setSubject(request.getParameter("subject"));     //subject받아옴 
		if(request.getParameter("protect").equals("false")) {
			vo.setProtect(false);
		}else {
			vo.setProtect(true);
		}
		vo.setContent(request.getParameter("content"));  //content받아옴 
				
		//int id = Integer.parseInt(request.getParameter("id"));
		//vo.setId(id);
		
		int resultInt = dao.insertBoard(vo);
		System.out.println("값:" + resultInt);
		
		try {
			System.out.println("board2.jsp로 가져야함!");
			response.sendRedirect("board.do");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		

	}

}