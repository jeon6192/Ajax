package ex5_2_switch;

import java.util.Scanner;

public class SwithchExample3 {

	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();		
		
		switch (str) {
		case "A":
		case "a":
			System.out.println("���");
			break;
		case "P":
		case "p":
			System.out.println("��");
			break;
		case "G":
		case "g":
			System.out.println("����");
			break;
		default:
			System.out.println("?");
			break;
		}
		sc.close();

	}

}