package ex5_4_dowhile;

import java.util.Scanner;

public class DoWhileEx2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("������ �Է��ϼ���~ �����Ϸ��� q�� �Է��ϼ���");
		do {
			str=sc.next();
			if(str.equals("q"))	System.out.println("����");
			else		System.out.println(str+"�Դϴ�.");
		}while(!str.equals("q"));
		sc.close();

	}
}