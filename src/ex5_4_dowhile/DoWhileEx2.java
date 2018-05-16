package ex5_4_dowhile;

import java.util.Scanner;

public class DoWhileEx2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("지역을 입력하세요~ 종료하려면 q를 입력하세요");
		do {
			str=sc.next();
			if(str.equals("q"))	System.out.println("종료");
			else		System.out.println(str+"입니다.");
		}while(!str.equals("q"));
		sc.close();

	}
}