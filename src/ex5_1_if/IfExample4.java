package ex5_1_if;

import java.util.Scanner;

public class IfExample4 {
	public static void main(String args[]) {
		int s;
		System.out.println("점수를 입력 하세요 : ");
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		
		if(s>=90)	System.out.println("A학점");
		else if(s>=80) System.out.println("B학점");
		else if(s>=70) System.out.println("C학점");
		else if(s>=60) System.out.println("D학점");
		else	System.out.println("F학점");
	}
}
