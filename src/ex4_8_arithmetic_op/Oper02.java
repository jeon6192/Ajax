package ex4_8_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02 {
	public static void main(String args[]) {
		InputStream is=System.in; // System.in �� InputStream��
		Scanner sc=new Scanner(is);
		
		System.out.print("������ �Է� �ϼ���");
		int a=sc.nextInt();
		System.out.println("�Է��Ͻ� ������ "+a+" �Դϴ�.");
		System.out.print("������ �Է� �ϼ���");
		int b=sc.nextInt();
		System.out.println("�Է��Ͻ� ������ "+b+" �Դϴ�.");
		sc.close();
		
		int c;
		double d;
		c=a+b;
		System.out.println(a+"+"+b+"="+c);
		c=a-b;
		System.out.println(a+"-"+b+"="+c);
		c=a*b;
		System.out.println(a+"*"+b+"="+c);
		d= ((double)a/(double)b);
		System.out.println(a+"/"+b+"="+d);
	}
}
