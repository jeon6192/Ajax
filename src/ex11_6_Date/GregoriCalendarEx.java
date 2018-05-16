package ex11_6_Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class GregoriCalendarEx {
	public static void main(String[] args) {
		GregorianCalendar calendar=new GregorianCalendar();
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY년 MM월 dd일 aa HH시 mm분 ss초");
		SimpleDateFormat dateFormat2=new SimpleDateFormat("yyyy년 M월 d일 a h시 m분 s초");
		SimpleDateFormat dateFormat3=new SimpleDateFormat("yyyy년 M월 d일 E a h시 m분 s초");
		
		
		System.out.println(calendar.getTime());
		System.out.println(new Date());
		System.out.println(calendar.getTimeInMillis());
		System.out.println(dateFormat.format(calendar.getTime()));
		System.out.println(dateFormat2.format(calendar.getTime()));
		System.out.println(dateFormat3.format(calendar.getTime()));
	}
}
