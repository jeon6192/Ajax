package ex4_8_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper2_2 {
	public static void main(String args[]) {
		InputStream is=System.in; // System.in �� InputStream��
		Scanner sc=new Scanner(is);
		
		System.out.print("������ �Է� �ϼ���");
		int n=sc.nextInt();
		sc.close();
		System.out.println(n%3==0?"3�� ��� �Դϴ�.":"3�� ����� �ƴմϴ�.");				
		
	}
}
