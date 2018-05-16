package ex5_2_switch;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수1를 입력하세요 : ");
		int num1=sc.nextInt();
		System.out.println("정수2를 입력하세요 : ");
		int num2=sc.nextInt();
		System.out.println("연산자를 입력하세요 : ");
		char ch=sc.next().charAt(0);
		sc.close();
		
		switch(ch) {
			case '+':
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case '-':
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case '*':
				System.out.println(num1+"*"+num2+"="+(num1*num2));
				break;
			case '/':
				System.out.println(num1+"/"+num2+"="+(num1/num2));
				break;			
			default:
				System.out.println("+,-,*,/ 중 한개를 입력하세요.");
		}

	}
}
