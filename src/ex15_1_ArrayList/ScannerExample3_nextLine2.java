package ex15_1_ArrayList;

import java.util.Scanner;

public class ScannerExample3_nextLine2 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		// ������ ���� �� ���� ������� �Է��غ�����
		// 1�� �Է��ϰ� ����
		// 21 ���� �ڹ��� ���� ����
		System.out.println("���̸� �Է��ϼ���");
		int age=a.nextInt();
		
		a.nextLine(); //  <-- nextLine() �����ִ� netInt() �� next()�� ���Ե� ���๮�ڸ� nextLine() �� �������� �� or ���� nextLine()���� ���
		System.out.println("�̸��� �Է��ϼ���");
		String name=a.nextLine();
		
		System.out.println("���̴� : "+age);
		if(name.equals(""))
			System.out.println("�̸��� : ���ڿ� �Դϴ�.");
		else {
			System.out.println("�̸��� : "+name);
			System.out.println("name�� ���� : "+name.length());
		}
		a.close();
		
	}
}
