package ex11_6_Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneEx {
	public static void main(String[] args) {
		Calendar calendar=new GregorianCalendar();
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy/MM/dd (E) aa hh:mm");
		sd1.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println("´º¿å\t"+sd1.format(calendar.getTime()));
		sd1.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		System.out.println("ÆÄ¸®\t"+sd1.format(calendar.getTime()));
		sd1.setTimeZone(TimeZone.getTimeZone("Asia/Hong_Kong"));
		System.out.println("È«Äá\t"+sd1.format(calendar.getTime()));
	}
	
}
