package ex4_8_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper2_2 {
	public static void main(String args[]) {
		InputStream is=System.in; // System.in 은 InputStream형
		Scanner sc=new Scanner(is);
		
		System.out.print("정수를 입력 하세요");
		int n=sc.nextInt();
		sc.close();
		System.out.println(n%3==0?"3의 배수 입니다.":"3의 배수가 아닙니다.");				
		
	}
}
