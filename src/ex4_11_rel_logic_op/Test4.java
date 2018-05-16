package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Test4 {

	public static void main(String args[]) {
		InputStream is=System.in;
		Scanner sc=new Scanner(is);
		
		System.out.println("정수를 입력하세요 : ");
		int b=sc.nextInt();
		sc.close();
		
		if(b==1||b==11) {
			System.out.println("1 또는 11 입니다.");
		}else{
			System.out.println("1 또는 11이 아닙니다.");
		}
		
	}
}
