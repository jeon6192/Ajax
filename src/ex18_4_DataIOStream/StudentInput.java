package ex18_4_DataIOStream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class StudentInput {
	public static void main(String[] args) {
		/*System.out.println("====   학생별   /  과목별 총점구하기  ====");
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");*/
		
		DataInputStream dis=null;
		ArrayList<Student> list=new ArrayList<Student>();
			try {
				dis=new DataInputStream(new FileInputStream("student.dat"));
				while(true) {
					String name=dis.readUTF();
					int kor=dis.readInt();
					int eng=dis.readInt();
					int math=dis.readInt();
					list.add(new Student(name, kor, eng, math));
					/*int total=kor+eng+math;
					float avg=(float)total/3;
					System.out.print(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t");
					System.out.printf("%.1f\n",avg);
					Student.korTotal+=kor;
					Student.engTotal+=eng;
					Student.mathTotal+=math;*/
				}
			}catch(FileNotFoundException fe) {
			}catch(EOFException e) {
				Student_main_method.print(list);
			}catch(IOException ioe) {
			}finally {
				try {
					if(dis!=null)	dis.close();
				}catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
			
				
			/*for (int j = 0; j < 28; j++) {
				System.out.print("=");
			}
			System.out.print("\n총점\t");
			System.out.print(Student.korTotal + "\t");
			System.out.print(Student.engTotal + "\t");
			System.out.print(Student.mathTotal + "\t");*/
			
	}
}
