package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Test2 {

	public static void main(String args[]) {
		InputStream is=System.in;
		Scanner sc=new Scanner(is);
		
		System.out.println("������ �Է��ϼ��� : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		
		if(a==b) {
			System.out.println("���� �� �Դϴ�.");
		}else{
			System.out.println("�ٸ� �� �Դϴ�.");
		}
	}
}
