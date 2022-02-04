package kr.re.kitri.util;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringToTimeUtil {
	
	public static java.sql.Date toDate(String stringDate){
		java.sql.Date sqlDate = null;
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date utilDate = transFormat.parse(stringDate);
			sqlDate = new java.sql.Date(utilDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sqlDate;
	}
}
