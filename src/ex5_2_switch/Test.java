package ex5_2_switch;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����1�� �Է��ϼ��� : ");
		int num1=sc.nextInt();
		System.out.println("����2�� �Է��ϼ��� : ");
		int num2=sc.nextInt();
		System.out.println("�����ڸ� �Է��ϼ��� : ");
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
				System.out.println("+,-,*,/ �� �Ѱ��� �Է��ϼ���.");
		}

	}
}
