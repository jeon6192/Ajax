package ex15_6_HashSet;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		ArrayList<MemberInfo> list=new ArrayList<MemberInfo>();
		
		do {
			MemberInfo obj=new MemberInfo();
			System.out.println("������ �Է��ϼ���? ");
			obj.setName(sc.nextLine());
			System.out.println("������ �Է��ϼ���? ");
			obj.setAge(Integer.valueOf(sc.nextLine()));
			System.out.println("E-Mail�� �Է��ϼ���? ");
			obj.setEmail(sc.nextLine());
			System.out.println("�ּҸ� �Է��ϼ���? ");
			obj.setAddress(sc.nextLine());
			do{
				System.out.println("(����Ϸ��� y\t���߷��� n)");
				str=sc.nextLine();
			}while(!str.equals("y") && !str.equals("n"));
			
			list.add(obj);
		}while(!str.equals("n")	&& str.equals("y"));
		
		sc.close();
		
		printMember(list);	
		
	}

	static void printMember(ArrayList<MemberInfo> list) {
		int num=list.size();
		System.out.println("=====����ؿ�=====");
		for(int cnt=0; cnt<num; cnt++) {
			System.out.println("===get("+cnt+")��° ��� ���===");
			System.out.println("���� : "+list.get(cnt).getName());
			System.out.println("���� : "+list.get(cnt).getAge());
			System.out.println("E-Mail : "+list.get(cnt).getEmail());
			System.out.println("�ּ� : "+list.get(cnt).getAddress());
		}
		
	}
}
