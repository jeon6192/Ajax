package ex5_5_for;

import java.util.Scanner;

public class For01_2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���ϴ� ���� �Է� �ϼ��� : ");
		int i=sc.nextInt();
		sc.close();
		for(int j=1;j<10;j++) {
			System.out.println(i+"*"+j+"="+i*j);
		}

	}
}