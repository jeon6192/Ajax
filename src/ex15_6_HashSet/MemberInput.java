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
			System.out.println("성명을 입력하세요? ");
			obj.setName(sc.nextLine());
			System.out.println("나이을 입력하세요? ");
			obj.setAge(Integer.valueOf(sc.nextLine()));
			System.out.println("E-Mail을 입력하세요? ");
			obj.setEmail(sc.nextLine());
			System.out.println("주소를 입력하세요? ");
			obj.setAddress(sc.nextLine());
			do{
				System.out.println("(계속하려면 y\t멈추려면 n)");
				str=sc.nextLine();
			}while(!str.equals("y") && !str.equals("n"));
			
			list.add(obj);
		}while(!str.equals("n")	&& str.equals("y"));
		
		sc.close();
		
		printMember(list);	
		
	}

	static void printMember(ArrayList<MemberInfo> list) {
		int num=list.size();
		System.out.println("=====출력해요=====");
		for(int cnt=0; cnt<num; cnt++) {
			System.out.println("===get("+cnt+")번째 사람 명단===");
			System.out.println("성명 : "+list.get(cnt).getName());
			System.out.println("나이 : "+list.get(cnt).getAge());
			System.out.println("E-Mail : "+list.get(cnt).getEmail());
			System.out.println("주소 : "+list.get(cnt).getAddress());
		}
		
	}
}
