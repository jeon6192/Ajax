package ex11_5_Calendar;

import java.util.*;

public class CalendarEx2 {
	/*enum Day{
		SUN("�Ͽ���"), MON("������"), TUE("ȭ����"), WED("������"), THU("�����"), FRI("�ݿ���"), SAT("�����");
		final private int num;
		private Day(int num) {
			this.num=num;
		}
		int getNum() {
			return num;
		}
	}*/
	public void print(Calendar c) {
		String dow="";
		String ampm="";
		switch (c.get(Calendar.DAY_OF_WEEK)) {
			case 1 :				dow="�Ͽ���";	break;
			case 2:				dow="������";	break;
			case 3:				dow="ȭ����";	break;
			case 4:				dow="������";	break;
			case 5:				dow="�����";	break;
			case 6:				dow="�ݿ���";	break;
			case 7:				dow="�����";	break;			
		}
		switch (c.get(Calendar.AM_PM)) {
			case 0:				ampm="����";	break;
			case 1:				ampm="����";	break;
		}
		System.out.println(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+c.get(Calendar.DATE)+"�� "
				+ampm+c.get(Calendar.HOUR_OF_DAY)+"��"+c.get(Calendar.MINUTE)+"��"+c.get(Calendar.SECOND)+"�� "+dow+"�Դϴ�.");

	}

}
