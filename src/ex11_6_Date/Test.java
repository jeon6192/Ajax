package ex11_6_Date;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("출력할 년도를 입력하세요>");
        int year=sc.nextInt();
        System.out.println("출력할 달을 입력하세요>");
        int month=sc.nextInt();
        sc.close();
        printCal(year, month);
	}
	
	static void printCal(int a, int b) {
		Calendar calendar=new GregorianCalendar(a, b-1, 1);
		int tab=calendar.get(Calendar.DAY_OF_WEEK)-1; // 일요일 :1 월요일 :2 ... 해당 달의 첫요일을 구해서 처음 탭간격을 정할 변수
		int last=calendar.getActualMaximum(Calendar.DATE);
		
		System.out.println("\t\t"+a+"년\t"+b+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i=0;i<tab;i++) {
            System.out.print("\t");
        }
        for (int i=1;i<=last;i++) {
            System.out.print(i+"\t");
            tab++;
            if (tab%7==0){
                System.out.println();
            }
        }
	}

}
