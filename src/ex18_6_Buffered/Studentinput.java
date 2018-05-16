package ex18_6_Buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Studentinput {
	public static void main(String args[]) {
		ArrayList<Student> list = new ArrayList<Student>();
		input(list);
		/*try (BufferedReader br=new BufferedReader(new FileReader("src\\ex18_6_Buffered\\Studentinput.java"))){
			String line="";
			for(int i=0;(line=br.readLine())!=null;i++) {
				if(line.indexOf(";")!=-1)
					System.out.println(line);
			}
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}*/
		
	}
	

	static void input(ArrayList<Student> list) {
		try (BufferedReader reader = new BufferedReader(new FileReader("studentinput.txt"));) {
			while (true) {
				String str = reader.readLine();// ���Ϸ� ���� �� �྿ �о��.
				if (str == null)
					break;
				/*StringTokenizer st=new StringTokenizer(str, " ");
				String name=st.nextToken();
				int kor=Integer.parseInt(st.nextToken());
				int eng=Integer.parseInt(st.nextToken());
				int math=Integer.parseInt(st.nextToken());*/
				String[] st=str.split(" ");
				String name=st[0];
				int kor=Integer.parseInt(st[1]);
				int eng=Integer.parseInt(st[2]);
				int math=Integer.parseInt(st[3]);
				list.add(new Student(name, kor, eng, math));
				//�������� �и��ؼ� �̸�, ����, ����, ���� ���� �����ɴϴ�.
				//Student ��ü ���� �� list�� �߰��մϴ�.
				
			}
			print(list);
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
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

		int num=list.size();
		System.out.print("\n����\t");
		System.out.print(Student.korTotal + "\t");
		System.out.print(Student.engTotal + "\t");
		System.out.print(Student.mathTotal + "\t");
		System.out.print(Student.total/num + "\t");
		System.out.printf("%.1f\n", Student.totalavg/num);

	}
}
