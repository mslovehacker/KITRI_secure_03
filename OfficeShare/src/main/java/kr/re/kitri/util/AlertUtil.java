package kr.re.kitri.util;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

/** 1111111
 * alert, alertAndMovePage, and alertAndBackPage method reference
 * @see <a href="https://redcoder.tistory.com/195">[������ ���� �ϱ�]</a>
 */
public class AlertUtil {
	
	/**
	 * Initialize response options.
	 * @param response [HttpServletResponse]
	 */
	public static void init(HttpServletResponse response) {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
    }
	
	/**
	 * Alert message without moving page.
	 * @param response [HttpServletResponse]
	 * @param alertText [String]
	*/
    public static void alert(HttpServletResponse response, String alertText) {
        init(response);
        PrintWriter out;
		try {
			out = response.getWriter();
			out.printf("<script>alert('%s');</script>", alertText);
	        out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
	/**
	 * Alert message with moving page.
	 * @param response [HttpServletResponse]
	 * @param alertText [String]
	 * @param nextPage [String]
	*/
    public static void alertAndMovePage(HttpServletResponse response, String alertText, String nextPage) {
        init(response);
        PrintWriter out;
		try {
			out = response.getWriter();
			out.printf("<script>alert('%s'); location.href='%s';</script>", alertText, nextPage);
	        out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
	/**
	 * Alert message with moving back page.
	 * @param response [HttpServletResponse]
	 * @param alertText [String]
	*/
    public static void alertAndBackPage(HttpServletResponse response, String alertText) {
        init(response);
        PrintWriter out;
		try {
			out = response.getWriter();
			out.printf("<script>alert('%s'); history.go(-1);</script>", alertText);
	        out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    /**
     * Combine strings with new line if original string is not null.
     * @param originalString [String]
     * @param newString [String]
     * @return combinedString [String]
     */
    public static String combineString(String originalString, String newString) {
    	String separation = "";
    	String combinedString = originalString;
    	if (originalString.length()>0) {
    		separation = "\n";
    	}
    	combinedString += separation+newString;
    	return combinedString;
    }
}
