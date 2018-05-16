package ex15_1_ArrayList;

import java.util.Scanner;

public class ScannerExample3_nextLine2 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		// 다음과 같이 두 가지 방법으로 입력해보세요
		// 1을 입력하고 엔터
		// 21 공백 자바의 정석 엔터
		System.out.println("나이를 입력하세요");
		int age=a.nextInt();
		
		a.nextLine(); //  <-- nextLine() 전에있는 netInt() 나 next()에 포함된 개행문자를 nextLine() 이 가져가게 함 or 전부 nextLine()으로 사용
		System.out.println("이름을 입력하세요");
		String name=a.nextLine();
		
		System.out.println("나이는 : "+age);
		if(name.equals(""))
			System.out.println("이름은 : 빈문자열 입니다.");
		else {
			System.out.println("이름은 : "+name);
			System.out.println("name의 길이 : "+name.length());
		}
		a.close();
		
	}
}
