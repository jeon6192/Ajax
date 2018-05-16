package ex11_6_Date;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("����� �⵵�� �Է��ϼ���>");
        int year=sc.nextInt();
        System.out.println("����� ���� �Է��ϼ���>");
        int month=sc.nextInt();
        sc.close();
        printCal(year, month);
	}
	
	static void printCal(int a, int b) {
		Calendar calendar=new GregorianCalendar(a, b-1, 1);
		int tab=calendar.get(Calendar.DAY_OF_WEEK)-1; // �Ͽ��� :1 ������ :2 ... �ش� ���� ù������ ���ؼ� ó�� �ǰ����� ���� ����
		int last=calendar.getActualMaximum(Calendar.DATE);
		
		System.out.println("\t\t"+a+"��\t"+b+"��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
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
