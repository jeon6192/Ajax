package ex15_1_ArrayList;

import java.util.ArrayList;

// Student를 ArrayList에 넣어 출력
public class Student_main_for {
	public static void main(String[] args) {
		Student h1=new Student("강호동", 85, 60, 70);
		Student h2=new Student("이승기", 90, 95, 80);
		Student h3=new Student("유재석", 75, 80, 100);
		Student h4=new Student("하하", 80, 70, 95);
		Student h5=new Student("이광수", 100, 65, 80);
		
		ArrayList<Student> as=new ArrayList<Student>();
		as.add(h1);
		as.add(h2);
		as.add(h3);
		as.add(h4);
		as.add(h5);
		
		System.out.println("=========== 학생별   /  과목별 총점구하기 ===========");
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
		for(int i=0; i<as.size(); i++) {
			System.out.print(as.get(i).name+"\t"
									+as.get(i).kor+"\t"
									+as.get(i).math+"\t"
									+as.get(i).eng+"\t"
									+as.get(i).getTotal()+"\t");
			System.out.println(as.get(i).getAverage());
		}
		System.out.println("=============================================");
		System.out.println("총점\t"+Student.korTotal+"\t"+Student.mathTotal+"\t"+Student.engTotal);
		
	}
}
