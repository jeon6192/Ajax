package ex15_1_ArrayList;

import java.util.Scanner;

public class MemberInput {
	public static void main(String[] args) {
		MemberInfo obj=new MemberInfo();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("성명을 입력하세요? ");
		obj.setName(sc.nextLine());
		System.out.println("나이을 입력하세요? ");
		obj.setAge(Integer.valueOf(sc.nextLine()));
		System.out.println("E-Mail을 입력하세요? ");
		obj.setEmail(sc.nextLine());
		System.out.println("주소를 입력하세요? ");
		obj.setAddress(sc.nextLine());
		sc.close();
		
		printMember(obj);
		
		
	}

	static void printMember(MemberInfo obj) {
		System.out.println("==출력해요==");
		System.out.println("성명 : "+obj.getName());
		System.out.println("나이 : "+obj.getAge());
		System.out.println("E-Mail : "+obj.getEmail());
		System.out.println("주소 : "+obj.getAddress());
	}
}
