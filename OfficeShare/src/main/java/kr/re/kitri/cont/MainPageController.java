package kr.re.kitri.cont;

import java.io.IOException;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MainPageController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//RequestDispatcher rd = request.getRequestDispatcher("JSP/Home.jsp");
		//System.out.println("MainPageController");
		//HttpSession hs = request.getSession();
		try {
			response.sendRedirect("index.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
