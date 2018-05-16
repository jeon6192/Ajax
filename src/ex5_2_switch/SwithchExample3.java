package ex5_2_switch;

import java.util.Scanner;

public class SwithchExample3 {

	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요 : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();		
		
		switch (str) {
		case "A":
		case "a":
			System.out.println("사과");
			break;
		case "P":
		case "p":
			System.out.println("배");
			break;
		case "G":
		case "g":
			System.out.println("포도");
			break;
		default:
			System.out.println("?");
			break;
		}
		sc.close();

	}

}