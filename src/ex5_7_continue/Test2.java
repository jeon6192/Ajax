package ex5_7_continue;

import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���ϴ� ���� �Է� �ϼ���?");
		int a=sc.nextInt();
		System.out.println(" *****"+a+"�� ����� ����մϴ�.*****");
			for(int j=1;j<=a;j++) {
				if(a%j==0)	System.out.print(j+" ");
			}
		sc.close();
			
	}
}
