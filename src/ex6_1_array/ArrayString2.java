package ex6_1_array;

import java.util.Scanner;

public class ArrayString2 {
	public static void main(String args[]) {
		String names[]= {"홍길동","전우치","홍길동","세종대왕","김길동"};
		System.out.println("검색할 이름");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		int a=10;
		for(int i=0;i<names.length;i++) {
			if(str.equals(names[i])) {
				a=i;
				break;
			}
		}
		if(a==10) {
			System.out.println("x");
		}else {
			System.out.println(a);
		}
		
		
		
	}
}