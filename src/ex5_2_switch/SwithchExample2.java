package ex5_2_switch;

import java.util.Scanner;

public class SwithchExample2 {

	public static void main(String[] args) {
		System.out.println("알파벳을 입력하세요 : ");
		Scanner sc=new Scanner(System.in);
		// String imsi=sc.next();
		// imsi.charAt(0);
		char ch=sc.next().charAt(0);
		
		switch (ch) {
		case 'A':
		case 'a':
			System.out.println("사과");			
			break;
		case 'P':
		case 'p':
			System.out.println("배");
			break;
		case 'G':
		case 'g':
			System.out.println("포도");
			break;
		default:
			System.out.println("?");
			break;
		}
		sc.close();

		/*String ismi=sc.next();
		System.out.println("첫번째 문자 : "+ismi.charAt(0));
		System.out.println("두번째 문자 : "+ismi.charAt(1));
		System.out.println("세번째 문자 : "+ismi.charAt(2));*/
	}

}
