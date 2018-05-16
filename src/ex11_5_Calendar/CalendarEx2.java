package ex11_5_Calendar;

import java.util.*;

public class CalendarEx2 {
	/*enum Day{
		SUN("일요일"), MON("월요일"), TUE("화요일"), WED("수요일"), THU("목요일"), FRI("금요일"), SAT("토요일");
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
			case 1 :				dow="일요일";	break;
			case 2:				dow="월요일";	break;
			case 3:				dow="화요일";	break;
			case 4:				dow="수요일";	break;
			case 5:				dow="목요일";	break;
			case 6:				dow="금요일";	break;
			case 7:				dow="토요일";	break;			
		}
		switch (c.get(Calendar.AM_PM)) {
			case 0:				ampm="오전";	break;
			case 1:				ampm="오후";	break;
		}
		System.out.println(c.get(Calendar.YEAR)+"년"+(c.get(Calendar.MONTH)+1)+"월"+c.get(Calendar.DATE)+"일 "
				+ampm+c.get(Calendar.HOUR_OF_DAY)+"시"+c.get(Calendar.MINUTE)+"분"+c.get(Calendar.SECOND)+"초 "+dow+"입니다.");

	}

}
