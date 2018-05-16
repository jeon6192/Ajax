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
				System.out.println("반드시 숫자 입력하세요.");
			} else {
				int selector = Integer.parseInt(select);
				switch (selector) {
				case 1:  //입력합니다.
					input(list, sc);
					break;
				case 5:  //출력합니다.
					printAll(list);
					break;
				case 6: //종료합니다.
					System.out.println("종료합니다.");
					sc.close();
					return;
				default:
					System.out.println("1 또는 5 또는 6의 숫자를 입력하세요");
				} // switch
			}
			System.out.println();
		} while (true);
		
	} // main

	static void input(ArrayList<MemberInfo> list, Scanner sc) {
		String str="";
		do {
			int age=0;
			System.out.print("성명을 입력하세요? ");
			String name = sc.nextLine();
			
			while(!isNumber(str)){
				System.out.print("나이를 입력하세요? ");
				str=sc.nextLine();
				if(!isNumber(str))
					System.out.println("나이는 숫자를 입력하셔야 합니다.");
				else 
					age=Integer.parseInt(str);
			}
			
			System.out.print("E-Mail을 입력하세요? ");
			String email = sc.nextLine();
			System.out.print("주소를 입력하세요? ");
			String address = sc.nextLine();
			MemberInfo m = new MemberInfo();
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

			list.add(m);

			do {
			  System.out.println("계속할려면 y, 멈출려면 n을 입력?");
			  str = sc.nextLine();
			}while(!str.equals("y") && !str.equals("n"));

		} while(!str.equals("n")	&& str.equals("y"));
	} // input
	
	static void printAll(ArrayList<MemberInfo> list) {
		int num=list.size();
		if(num>0) {
			System.out.println("=====출력해요=====");
			for(int cnt=0; cnt<num; cnt++) {
				System.out.println("===get("+cnt+")번째 사람 명단===");
				System.out.println("성명 : "+list.get(cnt).getName());
				System.out.println("나이 : "+list.get(cnt).getAge());
				System.out.println("E-Mail : "+list.get(cnt).getEmail());
				System.out.println("주소 : "+list.get(cnt).getAddress());
			} // for
		}else
			System.out.println("===== 출력할 데이터가 없습니다. =====");
	} // printMember()
	
	static void menu() {
		System.out.println("다음 중 선택하세요(반드시 숫자 입력)");
		System.out.println("1. 입력");
		System.out.println("5. 출력");
		System.out.println("6. 종료");
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
