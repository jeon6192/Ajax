package ex13_7;

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
		int last = calendar.getActualMaximum(Calendar.DATE);
		int[][] arr=new int[6][7];
		int day=1;
		
		Loop: for(int i=0;i<arr.length;i++) {			
			for(int j=0;j<arr[i].length;j++) {
				if(i==0&&j<tab) {
					arr[i][j]=0;
				}else if(day<=last){	
				arr[i][j]=day;
				day++;
				}else	break Loop;
			}
		}
		
		System.out.println("\t\t" + a + "��\t" + b + "��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==0)		System.out.print("\t");
				else {
					//System.out.print(arr[i][j]+"\t");
					System.out.printf("%2d\t",arr[i][j]);
				}
			}
			System.out.println();
		}
		
	}
}