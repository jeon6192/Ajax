package ex5_7_continue;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str;
		
		/*switch(str){
		case "����":
			System.out.println("�����Դϴ�.");
			break;
		case "�λ�":
			System.out.println("�λ��Դϴ�.");
			break;
		case "����":
			System.out.println("�����Դϴ�.");
			break;
		case "�뱸":
			System.out.println("�뱸�Դϴ�.");
			break;
		case "���ֵ�":
			System.out.println("���ֵ��Դϴ�.");
			break;
		case "q":
			System.out.println("�����մϴ�.");
			break;
		default:
			System.out.println("�� �������Դϴ�.");
		}*/
		
		do {
			System.out.println("������ �Է��ϼ��� : ");
			str=sc.nextLine();
			if(str.equals("����")||str.equals("�λ�")||str.equals("����")||str.equals("�뱸")||str.equals("���ֵ�")) {
				System.out.println(str+"�Դϴ�");
			}else if(str.equals("q")) {
				System.out.println("�����մϴ�.");
			}else {
				System.out.println("�� �������Դϴ�.");
			}
		}while(!str.equals("q"));
		sc.close();
				
	}
}