package ex7_1_object;

import java.util.Scanner;

public class Test {
	public static int abs(int a) {
		if(a<0)	a*=-1;
		return a;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 입력");
		int i=sc.nextInt();
		sc.close();
		System.out.println(i+"의 절대값 : "+abs(i));
	}

}
