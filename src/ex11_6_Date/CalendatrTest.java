package ex11_6_Date;

import java.util.Calendar;
import java.util.GregorianCalendar;

import ex11_5_Calendar.CalendarEx2;

public class CalendatrTest {
	public static void main(String[] args) {
		Calendar calendar=new GregorianCalendar(2002, 7, 1);
		CalendarEx2 today=new CalendarEx2();
		today.print(calendar);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
	}
}
