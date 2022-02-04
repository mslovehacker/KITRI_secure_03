package kr.re.kitri.util;

import javax.servlet.http.HttpServletResponse;

public class CheckSessionUtil {
	
	public static void checkHasUserId(String userId, HttpServletResponse response){
		if(userId==null) {
			AlertUtil.alertAndMovePage(response, "로그인 후 이용 가능한 서비스입니다.", "index.do");
		}
	}
	
	public static void checkNoUserId(String userId, HttpServletResponse response){
		if(userId!=null) {
			AlertUtil.alertAndMovePage(response, "로그인 상태에서는 이용할 수 없는 서비스입니다.", "index.do");
		}
	}
	
//	public static boolean checkHasUserId(String userId, HttpServletResponse response){
//		boolean returnValue = false;
//		if(userId==null) {
//			AlertUtil.alertAndMovePage(response, "잘못된 접근입니다.", "index.do");
//			returnValue = true;
//		}
//		return returnValue;
//	}
	
	public static void checkIsAdmin(String userRole, HttpServletResponse response){
		if(!userRole.equals("관리자")) {
			AlertUtil.alertAndMovePage(response, "관리자만 이용할 수 있는 서비스입니다.", "index.do");
		}
	}
	
//	public static boolean checkIsAdmin(String userRole, HttpServletResponse response){
//		boolean returnValue = false;
//		if(!userRole.equals("관리자")) {
//			AlertUtil.alertAndMovePage(response, "관리자만 이용할 수 있는 서비스입니다.", "index.do");
//			returnValue = true;
//		}
//		return returnValue;
//	}
}
