package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Test3 {

	public static void main(String args[]) {
		InputStream is=System.in;
		Scanner sc=new Scanner(is);
		
		System.out.println("정수를 입력하세요 : ");
		int a=sc.nextInt();
		sc.close();
		
		if(a>=1&&a<=10) {
			System.out.println("1~10 사이의 수 입니다.");
		}else{
			System.out.println("1~10 사이의 수가 아닙니다.");
		}
		
	}
}
