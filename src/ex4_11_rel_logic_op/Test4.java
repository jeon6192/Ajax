package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Test4 {

	public static void main(String args[]) {
		InputStream is=System.in;
		Scanner sc=new Scanner(is);
		
		System.out.println("������ �Է��ϼ��� : ");
		int b=sc.nextInt();
		sc.close();
		
		if(b==1||b==11) {
			System.out.println("1 �Ǵ� 11 �Դϴ�.");
		}else{
			System.out.println("1 �Ǵ� 11�� �ƴմϴ�.");
		}
		
	}
}
