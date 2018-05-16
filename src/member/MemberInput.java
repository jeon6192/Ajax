package member;

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
				case 2: // 검색합니다.
					search(list, sc);
					break;
				case 3:
					update(list, sc);
					break;
				case 4:
					delete(list, sc);
					break;
				case 5:  //출력합니다.
					printAll(list);
					break;
				case 6: //종료합니다.
					System.out.println("종료합니다.");
					sc.close();
					return;
				default:
					System.out.println("1 ~ 6의 숫자를 입력하세요");
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
 
			list.add(new MemberInfo(name, age, email, address));
 
			do {
			  System.out.println("계속하려면 y, 멈출려면 n을 입력?");
			  str = sc.nextLine();
			}while(!str.equals("y") && !str.equals("n"));
 
		} while(!str.equals("n")	&& str.equals("y"));
	} // input
	
	static int searchTitle(ArrayList<MemberInfo> list, Scanner sc) {
		int a;
		do {
			System.out.println("=== 검색할 항목을 선택하세요 ===");
			System.out.println("1. 성명\n2. 나이\n3. E-Mail\n4. 주소");
			String str=sc.nextLine();
			if(!isNumber(str)) {
				System.out.println("검색할 항목을 숫자로 입력하세요(1~4)");
			}else {
				a=Integer.parseInt(str);
				if(a<1 || a>4) 
					System.out.println("검색할 항목을 숫자로 입력하세요(1~4)");
				else // 선택된 번호가 1~4면 do while문을 빠져나감
					break;
			}
		} while(true);
		return a;
	}
	
	static int searchItem(ArrayList<MemberInfo> m, String item, int a, int b) {
		int c=0;
		switch (a) {
			case 1 :
				if(item.equals(m.get(b).getName()))
					c=1;
				break;
			case 2 :
				if(item.equals(Integer.toString(m.get(b).getAge())))
					c=1;
				break;
			case 3 :
				if(item.equals(m.get(b).getEmail()))
					c=1;
				break;
			case 4 :
				if(item.equals(m.get(b).getAddress()))
					c=1;
				break;
		}
		return c;
	}
	static void search(ArrayList<MemberInfo> list, Scanner sc) {
		String str="";
		int t=1;

		if(list.size()<1) {	// ArrayList 크기가 0이하면 출력X
			System.out.println("===== 검색할 데이터가 없습니다. =====");
			return;
		}
		int a=searchTitle(list, sc);
		str=inputItem(a, sc);
		
		for(int i=0;i<list.size();i++) {
			if(searchItem(list, str,a, i)==1) {
				System.out.println("=====검색된 "+(t++)+"번째 데이터 입니다.=====");
				print(list, i);
			}
		}
		if(t<2)	System.out.println("*****검색된 데이터가 없습니다.*****");
	}
	
	static String inputItem(int a, Scanner sc) {
		String[] item = {"성명", "나이", "E-Mail", "주소"};
		String str;
		if(a==2) {
			do{
				System.out.println("나이 을(를) 입력하세요");
				str=sc.nextLine();
				if(!isNumber(str))
					System.out.println("나이는 숫자를 입력하셔야 합니다.");
			}while(!isNumber(str)); 
		}else {
			System.out.println((item[a-1])+" 을(를) 입력하세요");
			str=sc.nextLine();
		}
		return str;
	}
	
	static void update(ArrayList<MemberInfo> list, Scanner sc) {
		String str="", str2="";
		int t=1;
		
		if(list.size()<1) {	// ArrayList 크기가 0이하면 출력X
			System.out.println("===== 수정할 데이터가 없습니다. =====");
			return;
		}
		int a=searchTitle(list, sc);
		
		String[] item = {"성명", "나이", "E-Mail", "주소"};
		str=inputItem(a, sc);
		if(a==2) {
			do{
			System.out.println("수정 후 나이 을(를) 입력하세요");
			str2=sc.nextLine();
			if(!isNumber(str2))
				System.out.println("나이는 숫자를 입력하셔야 합니다.");
			}while(!isNumber(str2)); 
		}else {
			System.out.println("수정 후 "+(item[a-1])+" 을(를) 입력하세요");
			str2=sc.nextLine();
		}
		
		for(int i=0;i<list.size();i++) {
			if(searchItem(list, str,a, i)==1) {
				switch(a){
					case 1:
						list.get(i).setName(str2);
						break;
					case 2:
						list.get(i).setAge(Integer.parseInt(str2));
						break;
					case 3:
						list.get(i).setEmail(str2);
						break;
					case 4:
						list.get(i).setAddress(str2);
						break;
				}
				System.out.println("=====검색된 "+(t++)+"번째 데이터 입니다.=====");
				print(list, i);
			}
		}
		if(t<2)	System.out.println("*****검색된 데이터가 없습니다.*****");
			
	}	// update
	
	static void delete(ArrayList<MemberInfo> list, Scanner sc) {
		String str="";
		int t=0;
		

		if(list.size()<1) {	// ArrayList 크기가 0이하면 출력X
			System.out.println("===== 삭제할 데이터가 없습니다. =====");
			return;
		}
		int a=searchTitle(list, sc);
		str=inputItem(a, sc);
		for(int i=list.size()-1;i>=0;i--) {
			if(searchItem(list, str,a, i)==1) {
				System.out.println("***성공적으로 삭제 했습니다.***");
				print(list, i);
				list.remove(i);
				t++;
			}
		}
		if(t<1)	System.out.println("*****검색된 데이터가 없습니다.*****");
		
	}	// delete
	
	static void print(ArrayList<MemberInfo> list, int i) {
		System.out.println("성명 : "+list.get(i).getName());
		System.out.println("나이 : "+list.get(i).getAge());
		System.out.println("E-Mail : "+list.get(i).getEmail());
		System.out.println("주소 : "+list.get(i).getAddress());
	}
	
	static void printAll(ArrayList<MemberInfo> list) {
		int num=list.size();
		if(num>0) {
			System.out.println("=====출력해요=====");
			for(int cnt=0; cnt<num; cnt++) {
				System.out.println("===get("+cnt+")번째 사람 명단===");
				print(list, cnt);
			} // for
		}else
			System.out.println("===== 출력할 데이터가 없습니다. =====");
	} // printMember()
	
	static void menu() {
		System.out.println("다음 중 선택하세요(반드시 숫자 입력)");
		System.out.println("1. 입력");
		System.out.println("2. 검색");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
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
