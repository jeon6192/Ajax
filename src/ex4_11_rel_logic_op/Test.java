package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Test {

	public static void main(String args[]) {
		InputStream is=System.in;
		Scanner sc=new Scanner(is);
		
		System.out.println("정수를 입력하세요 : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		
		if(a>b) {
			System.out.println("더 큰 수는 "+a+" 입니다.");
		}else if(a<b) {
			System.out.println("더 큰 수는 "+b+" 입니다.");
		}else{
			System.out.println("두 수는 같습니다.");
		}
	}
}
