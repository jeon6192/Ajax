package ex5_2_switch;

import java.util.Scanner;

public class SwithchExample2 {

	public static void main(String[] args) {
		System.out.println("���ĺ��� �Է��ϼ��� : ");
		Scanner sc=new Scanner(System.in);
		// String imsi=sc.next();
		// imsi.charAt(0);
		char ch=sc.next().charAt(0);
		
		switch (ch) {
		case 'A':
		case 'a':
			System.out.println("���");			
			break;
		case 'P':
		case 'p':
			System.out.println("��");
			break;
		case 'G':
		case 'g':
			System.out.println("����");
			break;
		default:
			System.out.println("?");
			break;
		}
		sc.close();

		/*String ismi=sc.next();
		System.out.println("ù��° ���� : "+ismi.charAt(0));
		System.out.println("�ι�° ���� : "+ismi.charAt(1));
		System.out.println("����° ���� : "+ismi.charAt(2));*/
	}

}
