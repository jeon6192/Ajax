package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarTimeZone {

	public static void main(String[] args) {
		Calendar calendar=new GregorianCalendar();
		CalendarEx2 c=new CalendarEx2();
		TimeZone timeZone=TimeZone.getTimeZone("Australia/Melbourne");
		calendar.setTimeZone(timeZone);
		System.out.println("¸á¹ö¸¥ ½Ã°£");
		c.print(calendar);
	}

}
