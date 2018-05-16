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
				System.out.println("�ݵ�� ���� �Է��ϼ���.");
			} else {
				int selector = Integer.parseInt(select);
				switch (selector) {
				case 1:  //�Է��մϴ�.
					input(list, sc);
					break;
				case 2: // �˻��մϴ�.
					search(list, sc);
					break;
				case 3:
					update(list, sc);
					break;
				case 4:
					delete(list, sc);
					break;
				case 5:  //����մϴ�.
					printAll(list);
					break;
				case 6: //�����մϴ�.
					System.out.println("�����մϴ�.");
					sc.close();
					return;
				default:
					System.out.println("1 ~ 6�� ���ڸ� �Է��ϼ���");
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
 
			list.add(new MemberInfo(name, age, email, address));
 
			do {
			  System.out.println("����Ϸ��� y, ������� n�� �Է�?");
			  str = sc.nextLine();
			}while(!str.equals("y") && !str.equals("n"));
 
		} while(!str.equals("n")	&& str.equals("y"));
	} // input
	
	static int searchTitle(ArrayList<MemberInfo> list, Scanner sc) {
		int a;
		do {
			System.out.println("=== �˻��� �׸��� �����ϼ��� ===");
			System.out.println("1. ����\n2. ����\n3. E-Mail\n4. �ּ�");
			String str=sc.nextLine();
			if(!isNumber(str)) {
				System.out.println("�˻��� �׸��� ���ڷ� �Է��ϼ���(1~4)");
			}else {
				a=Integer.parseInt(str);
				if(a<1 || a>4) 
					System.out.println("�˻��� �׸��� ���ڷ� �Է��ϼ���(1~4)");
				else // ���õ� ��ȣ�� 1~4�� do while���� ��������
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

		if(list.size()<1) {	// ArrayList ũ�Ⱑ 0���ϸ� ���X
			System.out.println("===== �˻��� �����Ͱ� �����ϴ�. =====");
			return;
		}
		int a=searchTitle(list, sc);
		str=inputItem(a, sc);
		
		for(int i=0;i<list.size();i++) {
			if(searchItem(list, str,a, i)==1) {
				System.out.println("=====�˻��� "+(t++)+"��° ������ �Դϴ�.=====");
				print(list, i);
			}
		}
		if(t<2)	System.out.println("*****�˻��� �����Ͱ� �����ϴ�.*****");
	}
	
	static String inputItem(int a, Scanner sc) {
		String[] item = {"����", "����", "E-Mail", "�ּ�"};
		String str;
		if(a==2) {
			do{
				System.out.println("���� ��(��) �Է��ϼ���");
				str=sc.nextLine();
				if(!isNumber(str))
					System.out.println("���̴� ���ڸ� �Է��ϼž� �մϴ�.");
			}while(!isNumber(str)); 
		}else {
			System.out.println((item[a-1])+" ��(��) �Է��ϼ���");
			str=sc.nextLine();
		}
		return str;
	}
	
	static void update(ArrayList<MemberInfo> list, Scanner sc) {
		String str="", str2="";
		int t=1;
		
		if(list.size()<1) {	// ArrayList ũ�Ⱑ 0���ϸ� ���X
			System.out.println("===== ������ �����Ͱ� �����ϴ�. =====");
			return;
		}
		int a=searchTitle(list, sc);
		
		String[] item = {"����", "����", "E-Mail", "�ּ�"};
		str=inputItem(a, sc);
		if(a==2) {
			do{
			System.out.println("���� �� ���� ��(��) �Է��ϼ���");
			str2=sc.nextLine();
			if(!isNumber(str2))
				System.out.println("���̴� ���ڸ� �Է��ϼž� �մϴ�.");
			}while(!isNumber(str2)); 
		}else {
			System.out.println("���� �� "+(item[a-1])+" ��(��) �Է��ϼ���");
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
				System.out.println("=====�˻��� "+(t++)+"��° ������ �Դϴ�.=====");
				print(list, i);
			}
		}
		if(t<2)	System.out.println("*****�˻��� �����Ͱ� �����ϴ�.*****");
			
	}	// update
	
	static void delete(ArrayList<MemberInfo> list, Scanner sc) {
		String str="";
		int t=0;
		

		if(list.size()<1) {	// ArrayList ũ�Ⱑ 0���ϸ� ���X
			System.out.println("===== ������ �����Ͱ� �����ϴ�. =====");
			return;
		}
		int a=searchTitle(list, sc);
		str=inputItem(a, sc);
		for(int i=list.size()-1;i>=0;i--) {
			if(searchItem(list, str,a, i)==1) {
				System.out.println("***���������� ���� �߽��ϴ�.***");
				print(list, i);
				list.remove(i);
				t++;
			}
		}
		if(t<1)	System.out.println("*****�˻��� �����Ͱ� �����ϴ�.*****");
		
	}	// delete
	
	static void print(ArrayList<MemberInfo> list, int i) {
		System.out.println("���� : "+list.get(i).getName());
		System.out.println("���� : "+list.get(i).getAge());
		System.out.println("E-Mail : "+list.get(i).getEmail());
		System.out.println("�ּ� : "+list.get(i).getAddress());
	}
	
	static void printAll(ArrayList<MemberInfo> list) {
		int num=list.size();
		if(num>0) {
			System.out.println("=====����ؿ�=====");
			for(int cnt=0; cnt<num; cnt++) {
				System.out.println("===get("+cnt+")��° ��� ���===");
				print(list, cnt);
			} // for
		}else
			System.out.println("===== ����� �����Ͱ� �����ϴ�. =====");
	} // printMember()
	
	static void menu() {
		System.out.println("���� �� �����ϼ���(�ݵ�� ���� �Է�)");
		System.out.println("1. �Է�");
		System.out.println("2. �˻�");
		System.out.println("3. ����");
		System.out.println("4. ����");
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
