package ex15_1_ArrayList;

import java.util.ArrayList;

// Student�� ArrayList�� �־� ���
public class Student_main_for {
	public static void main(String[] args) {
		Student h1=new Student("��ȣ��", 85, 60, 70);
		Student h2=new Student("�̽±�", 90, 95, 80);
		Student h3=new Student("���缮", 75, 80, 100);
		Student h4=new Student("����", 80, 70, 95);
		Student h5=new Student("�̱���", 100, 65, 80);
		
		ArrayList<Student> as=new ArrayList<Student>();
		as.add(h1);
		as.add(h2);
		as.add(h3);
		as.add(h4);
		as.add(h5);
		
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
