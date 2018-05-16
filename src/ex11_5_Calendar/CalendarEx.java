package ex11_5_Calendar;

import java.util.Calendar;

class CalendarEx {
	public static void main(String[] args) {
		/*
		 Calendar�� �߻�Ŭ�����̹Ƿ� ��ü�����Ұ�
		 Calendar c=new Calendar(); X
		 ����
		  Calendar c=Calendar.getInstance(); -> ����(static)�ż���� ��� 	getInstance() : Calendar Ŭ������ ������ Ŭ������ �ν��Ͻ���ȯ
		  Calendar c=new GregorianCalendar(); -> ��ĳ����
		 */
		Calendar today=Calendar.getInstance();
		System.out.println("�� ���ǳ⵵ : "+today.get(Calendar.YEAR));
		System.out.println("�� : "+(today.get(Calendar.MONTH)+1));
		System.out.println("�� ���� �� ° �� : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� �� ° �� : "+today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("�� ���� ��ĥ : "+today.get(Calendar.DATE));
		System.out.println("�� ���� ��ĥ : "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("�� ���� ��ĥ : "+today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("���� : "+today.get(Calendar.DAY_OF_WEEK)); // 1:�Ͽ��� 2:������
		System.out.println("�� ���� ��� ° ���� : "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("���� ���� : "+today.get(Calendar.AM_PM)); // 0:���� 1:����
		System.out.println("�ð� : "+today.get(Calendar.HOUR)); // 0~11
		System.out.println("�ð� : "+today.get(Calendar.HOUR_OF_DAY)); // 0~24
		System.out.println("�� : "+today.get(Calendar.MINUTE)+" �� : "+today.get(Calendar.SECOND));
		System.out.println("�� ���� ������ �� : "+today.getActualMaximum(Calendar.DATE));
		
		System.out.println("1/1000 �� : "+today.get(Calendar.MILLISECOND)); // 0~999

	}

}
