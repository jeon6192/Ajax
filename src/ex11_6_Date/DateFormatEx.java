package ex11_6_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx {
	public static void main(String[] args) {
		String start="2018-02-05";
		String end="2018-08-14";
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date beginDate=dateFormat.parse(start);
			Date endDate=dateFormat.parse(end);
			System.out.println(beginDate);
			System.out.println(endDate);
			System.out.println(dateFormat.format(beginDate));
			Date d=new Date();
			long a=endDate.getTime()-beginDate.getTime();
			long b=86400000L;
			long c=d.getTime()-beginDate.getTime();
			long e=endDate.getTime()-d.getTime();
			System.out.println(a/b);
			System.out.println(c/b);
			System.out.println(e/b);
			
			
		}catch(ParseException e) {
			
		}
	
	}
}
