package ex5_1_if;

import java.util.Scanner;

public class IfExample4 {
	public static void main(String args[]) {
		int s;
		System.out.println("������ �Է� �ϼ��� : ");
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		
		if(s>=90)	System.out.println("A����");
		else if(s>=80) System.out.println("B����");
		else if(s>=70) System.out.println("C����");
		else if(s>=60) System.out.println("D����");
		else	System.out.println("F����");
	}
}
