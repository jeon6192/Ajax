package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Test3 {

	public static void main(String args[]) {
		InputStream is=System.in;
		Scanner sc=new Scanner(is);
		
		System.out.println("������ �Է��ϼ��� : ");
		int a=sc.nextInt();
		sc.close();
		
		if(a>=1&&a<=10) {
			System.out.println("1~10 ������ �� �Դϴ�.");
		}else{
			System.out.println("1~10 ������ ���� �ƴմϴ�.");
		}
		
	}
}
