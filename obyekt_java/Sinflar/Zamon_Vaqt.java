package Sinflar;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Zamon_Vaqt {
	
	public static String sananikorsat(Timestamp ts) {
		Date date = new Date(ts.getTime());
		String korsatish = "dd/mm/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(korsatish);
		return sdf.format(date);
	}
	public static String kunni_korsat(Timestamp ts) {
		Date date = new Date(ts.getTime());
		String korsatish = "dd";
		SimpleDateFormat sdf = new SimpleDateFormat(korsatish);
		return sdf.format(date);
	}
	public static String vaqtni_korsat(Timestamp ts) {
		Date date = new Date(ts.getTime());
		String korsatish = "hh:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(korsatish);
		return sdf.format(date);
	}
	
}
