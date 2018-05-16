package ex4_8_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02 {
	public static void main(String args[]) {
		InputStream is=System.in; // System.in 은 InputStream형
		Scanner sc=new Scanner(is);
		
		System.out.print("정수를 입력 하세요");
		int a=sc.nextInt();
		System.out.println("입력하신 정수는 "+a+" 입니다.");
		System.out.print("정수를 입력 하세요");
		int b=sc.nextInt();
		System.out.println("입력하신 정수는 "+b+" 입니다.");
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
