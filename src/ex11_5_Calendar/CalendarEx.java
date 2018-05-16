package ex11_5_Calendar;

import java.util.Calendar;

class CalendarEx {
	public static void main(String[] args) {
		/*
		 Calendar는 추상클래스이므로 객체생성불가
		 Calendar c=new Calendar(); X
		 사용법
		  Calendar c=Calendar.getInstance(); -> 정적(static)매서드로 사용 	getInstance() : Calendar 클래스를 구현한 클래스의 인스턴스반환
		  Calendar c=new GregorianCalendar(); -> 업캐스팅
		 */
		Calendar today=Calendar.getInstance();
		System.out.println("이 해의년도 : "+today.get(Calendar.YEAR));
		System.out.println("월 : "+(today.get(Calendar.MONTH)+1));
		System.out.println("이 해의 몇 째 주 : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주 : "+today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("이 달의 며칠 : "+today.get(Calendar.DATE));
		System.out.println("이 달의 며칠 : "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 며칠 : "+today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("요일 : "+today.get(Calendar.DAY_OF_WEEK)); // 1:일요일 2:월요일
		System.out.println("이 달의 몇번 째 요일 : "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전 오후 : "+today.get(Calendar.AM_PM)); // 0:오전 1:오후
		System.out.println("시간 : "+today.get(Calendar.HOUR)); // 0~11
		System.out.println("시간 : "+today.get(Calendar.HOUR_OF_DAY)); // 0~24
		System.out.println("분 : "+today.get(Calendar.MINUTE)+" 초 : "+today.get(Calendar.SECOND));
		System.out.println("이 달의 마지막 날 : "+today.getActualMaximum(Calendar.DATE));
		
		System.out.println("1/1000 초 : "+today.get(Calendar.MILLISECOND)); // 0~999

	}

}
