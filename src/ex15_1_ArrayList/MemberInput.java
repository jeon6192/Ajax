package ex15_1_ArrayList;

import java.util.Scanner;

public class MemberInput {
	public static void main(String[] args) {
		MemberInfo obj=new MemberInfo();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���? ");
		obj.setName(sc.nextLine());
		System.out.println("������ �Է��ϼ���? ");
		obj.setAge(Integer.valueOf(sc.nextLine()));
		System.out.println("E-Mail�� �Է��ϼ���? ");
		obj.setEmail(sc.nextLine());
		System.out.println("�ּҸ� �Է��ϼ���? ");
		obj.setAddress(sc.nextLine());
		sc.close();
		
		printMember(obj);
		
		
	}

	static void printMember(MemberInfo obj) {
		System.out.println("==����ؿ�==");
		System.out.println("���� : "+obj.getName());
		System.out.println("���� : "+obj.getAge());
		System.out.println("E-Mail : "+obj.getEmail());
		System.out.println("�ּ� : "+obj.getAddress());
	}
}
