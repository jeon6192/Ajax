package ex15_1_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Student�� �Է¹ް� Arraylist�� ���
public class Student_main_for2 {
	public static void main(String[] args) {
		String str="";
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> as=new ArrayList<Student>();
		
		 do{
			System.out.println("�̸��� �Է��ϼ���");
			String name=sc.nextLine();
			System.out.println("���� ������ �Է��ϼ���");
			int kor=sc.nextInt();
			System.out.println("���� ������ �Է��ϼ���");
			int math=sc.nextInt();
			System.out.println("���� ������ �Է��ϼ���");
			int eng=sc.nextInt();
			sc.nextLine();
			System.out.println("����Է��Ͻðڽ��ϱ�? (q �Ǵ� Q �̸� ����)");
			str=sc.nextLine();
			Student obj=new Student(name, kor, math, eng);
			as.add(obj);
		}while(!str.equalsIgnoreCase("q"));	// equalsIgnoreCase() : ��ҹ��� ����x  q or Q
		sc.close();
		
		
		System.out.println("=========== �л���   /  ���� �������ϱ� ===========");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for(int i=0; i<as.size(); i++) {
			System.out.print(as.get(i).name+"\t"
									+as.get(i).kor+"\t"
									+as.get(i).math+"\t"
									+as.get(i).eng+"\t"
									+as.get(i).getTotal()+"\t");
			System.out.println(as.get(i).getAverage());
		}
		System.out.println("=============================================");
		System.out.println("����\t"+Student.korTotal+"\t"+Student.mathTotal+"\t"+Student.engTotal);
		
	}
}
