package kr.re.kitri.cont;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EquipmentIntroductionController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.sendRedirect("equipment.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
