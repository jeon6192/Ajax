package ex17_7_syn_problem;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<MemberInfo> list=new ArrayList<MemberInfo>();
		
		do {
			menu();
			String select=sc.nextLine();
			if (!isNumber(select)) {
				System.out.println("�ݵ�� ���� �Է��ϼ���.");
			} else {
				int selector = Integer.parseInt(select);
				switch (selector) {
				case 1:  //�Է��մϴ�.
					input(list, sc);
					break;
				case 5:  //����մϴ�.
					printAll(list);
					break;
				case 6: //�����մϴ�.
					System.out.println("�����մϴ�.");
					sc.close();
					return;
				default:
					System.out.println("1 �Ǵ� 5 �Ǵ� 6�� ���ڸ� �Է��ϼ���");
				} // switch
			}
			System.out.println();
		} while (true);
		
	} // main

	static void input(ArrayList<MemberInfo> list, Scanner sc) {
		String str="";
		do {
			int age=0;
			System.out.print("������ �Է��ϼ���? ");
			String name = sc.nextLine();
			
			while(!isNumber(str)){
				System.out.print("���̸� �Է��ϼ���? ");
				str=sc.nextLine();
				if(!isNumber(str))
					System.out.println("���̴� ���ڸ� �Է��ϼž� �մϴ�.");
				else 
					age=Integer.parseInt(str);
			}
			
			System.out.print("E-Mail�� �Է��ϼ���? ");
			String email = sc.nextLine();
			System.out.print("�ּҸ� �Է��ϼ���? ");
			String address = sc.nextLine();
			MemberInfo m = new MemberInfo();
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

			list.add(m);

			do {
			  System.out.println("����ҷ��� y, ������� n�� �Է�?");
			  str = sc.nextLine();
			}while(!str.equals("y") && !str.equals("n"));

		} while(!str.equals("n")	&& str.equals("y"));
	} // input
	
	static void printAll(ArrayList<MemberInfo> list) {
		int num=list.size();
		if(num>0) {
			System.out.println("=====����ؿ�=====");
			for(int cnt=0; cnt<num; cnt++) {
				System.out.println("===get("+cnt+")��° ��� ���===");
				System.out.println("���� : "+list.get(cnt).getName());
				System.out.println("���� : "+list.get(cnt).getAge());
				System.out.println("E-Mail : "+list.get(cnt).getEmail());
				System.out.println("�ּ� : "+list.get(cnt).getAddress());
			} // for
		}else
			System.out.println("===== ����� �����Ͱ� �����ϴ�. =====");
	} // printMember()
	
	static void menu() {
		System.out.println("���� �� �����ϼ���(�ݵ�� ���� �Է�)");
		System.out.println("1. �Է�");
		System.out.println("5. ���");
		System.out.println("6. ����");
	}
	
	static boolean isNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	} // isNumber
}
