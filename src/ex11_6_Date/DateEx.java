package ex11_6_Date;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println("Date ��� : "+d);
		SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd2=new SimpleDateFormat("yyyy��MM��dd��");
		System.out.println(sd1.format(d));
		System.out.println(sd2.format(d));
		SimpleDateFormat sd3 = new SimpleDateFormat("yyyy�� MM�� dd�� a h�� m�� s�� E����");
		System.out.println(System.currentTimeMillis()+"�и���"); // ����ǥ�ؽð� 1970/1/1/0/0/0 ���κ��� ����� �ð�
		Timestamp ts=new Timestamp(System.currentTimeMillis());
		System.out.println("Timestamp : "+ts);
		System.out.println(sd3.format(ts));
	}

}
