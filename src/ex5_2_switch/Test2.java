package ex5_2_switch;

import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int r=sc.nextInt();
		sc.close();
		
		switch(r/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}


	}
}