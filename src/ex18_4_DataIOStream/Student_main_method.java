package ex18_4_DataIOStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_main_method {
	public static void main(String args[]) {
	
		ArrayList<Student> list = new ArrayList<Student>();
		input(list);
	}
	
	static void input(ArrayList<Student> list) {
		String pandan = "";
		String name="";
		int kor, eng, math;
		Scanner sc = new Scanner(System.in);
		DataOutputStream dos=null;
		try {
			dos=new DataOutputStream(new FileOutputStream("student.dat"));
			while (!pandan.equalsIgnoreCase("q")) {
				System.out.println("�̸��� �Է��ϼ���?");
				name = sc.nextLine();
				System.out.println("���� ������ �Է��ϼ���?");
				kor = sc.nextInt();
				System.out.println("���� ������ �Է��ϼ���?");
				eng = sc.nextInt();
				System.out.println("���� ������ �Է��ϼ���?");
				math = sc.nextInt(); // ���� ���� �Է� �� ���͸� �Է��ϴµ� ���������� math�� �������� ���ʹ� nextLine()�� �������ϴ�.
				sc.nextLine();
				
				try {
					dos.writeUTF(name);
					dos.writeInt(kor);
					dos.writeInt(eng);
					dos.writeInt(math);
				}catch(Exception e) {}
				System.out.println("����Է��Ͻðڽ��ϱ�?(q �Ǵ� Q �̸� ����)");
				pandan = sc.nextLine();
			} // while
			sc.close();
		} catch (FileNotFoundException e1) {}
		finally {
			try {
				dos.close();
			}catch(Exception e) {}
		}
	}

	static void print(ArrayList<Student> list) {
		System.out.println("==========   �л���   /  ���� �������ϱ�  ==========");
		System.out.println("�̸�\t����\t����\t����\t����\t���");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).name + "\t" + list.get(i).kor + "\t" + list.get(i).eng + "\t"
					+ list.get(i).math + "\t" + list.get(i).getTotal() + "\t");
			System.out.printf("%.1f\n", list.get(i).getAverage());
		}

		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}

		System.out.print("\n����\t");
		System.out.print(Student.korTotal + "\t");
		System.out.print(Student.engTotal + "\t");
		System.out.print(Student.mathTotal + "\t");
		
		
	}
}
