package ex7_1_object;

import java.util.Scanner;

public class Test {
	public static int abs(int a) {
		if(a<0)	a*=-1;
		return a;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �Է�");
		int i=sc.nextInt();
		sc.close();
		System.out.println(i+"�� ���밪 : "+abs(i));
	}

}
