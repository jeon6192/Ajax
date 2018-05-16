package ex11_6_Date;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println("Date 사용 : "+d);
		SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd2=new SimpleDateFormat("yyyy년MM월dd일");
		System.out.println(sd1.format(d));
		System.out.println(sd2.format(d));
		SimpleDateFormat sd3 = new SimpleDateFormat("yyyy년 MM월 dd일 a h시 m분 s초 E요일");
		System.out.println(System.currentTimeMillis()+"밀리초"); // 국제표준시각 1970/1/1/0/0/0 으로부터 경과한 시각
		Timestamp ts=new Timestamp(System.currentTimeMillis());
		System.out.println("Timestamp : "+ts);
		System.out.println(sd3.format(ts));
	}

}
