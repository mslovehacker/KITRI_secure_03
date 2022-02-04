package kr.re.kitri.cont;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InformationRoomController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.sendRedirect("inforoom.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
