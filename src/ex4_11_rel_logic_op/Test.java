package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Test {

	public static void main(String args[]) {
		InputStream is=System.in;
		Scanner sc=new Scanner(is);
		
		System.out.println("������ �Է��ϼ��� : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		
		if(a>b) {
			System.out.println("�� ū ���� "+a+" �Դϴ�.");
		}else if(a<b) {
			System.out.println("�� ū ���� "+b+" �Դϴ�.");
		}else{
			System.out.println("�� ���� �����ϴ�.");
		}
	}
}
