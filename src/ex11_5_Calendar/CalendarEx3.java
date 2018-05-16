package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

class CalendarEx3 {
	public static void main(String[] args) {
		CalendarEx2 t=new CalendarEx2();
		Calendar c=new GregorianCalendar();		
		t.print(c);
		c.add(Calendar.DATE, 10);		
		t.print(c);
	}

}
