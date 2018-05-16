package ex5_5_for;

import java.util.Scanner;

public class For01_2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("원하는 단을 입력 하세요 : ");
		int i=sc.nextInt();
		sc.close();
		for(int j=1;j<10;j++) {
			System.out.println(i+"*"+j+"="+i*j);
		}

	}
}