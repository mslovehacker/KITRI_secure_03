package kr.re.kitri.cont;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePageController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.sendRedirect("index.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
