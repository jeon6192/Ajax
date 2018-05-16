package ex5_7_continue;

import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("원하는 수를 입력 하세요?");
		int a=sc.nextInt();
		System.out.println(" *****"+a+"의 약수를 출력합니다.*****");
			for(int j=1;j<=a;j++) {
				if(a%j==0)	System.out.print(j+" ");
			}
		sc.close();
			
	}
}
