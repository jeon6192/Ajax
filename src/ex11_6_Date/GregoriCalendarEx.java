package ex11_6_Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class GregoriCalendarEx {
	public static void main(String[] args) {
		GregorianCalendar calendar=new GregorianCalendar();
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY�� MM�� dd�� aa HH�� mm�� ss��");
		SimpleDateFormat dateFormat2=new SimpleDateFormat("yyyy�� M�� d�� a h�� m�� s��");
		SimpleDateFormat dateFormat3=new SimpleDateFormat("yyyy�� M�� d�� E a h�� m�� s��");
		
		
		System.out.println(calendar.getTime());
		System.out.println(new Date());
		System.out.println(calendar.getTimeInMillis());
		System.out.println(dateFormat.format(calendar.getTime()));
		System.out.println(dateFormat2.format(calendar.getTime()));
		System.out.println(dateFormat3.format(calendar.getTime()));
	}
}
