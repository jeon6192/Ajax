package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Test2 {

	public static void main(String args[]) {
		InputStream is=System.in;
		Scanner sc=new Scanner(is);
		
		System.out.println("정수를 입력하세요 : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		
		if(a==b) {
			System.out.println("같은 수 입니다.");
		}else{
			System.out.println("다른 수 입니다.");
		}
	}
}
