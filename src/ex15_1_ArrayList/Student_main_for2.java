package ex15_1_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Student를 입력받고 Arraylist로 출력
public class Student_main_for2 {
	public static void main(String[] args) {
		String str="";
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> as=new ArrayList<Student>();
		
		 do{
			System.out.println("이름을 입력하세요");
			String name=sc.nextLine();
			System.out.println("국어 점수를 입력하세요");
			int kor=sc.nextInt();
			System.out.println("수학 점수를 입력하세요");
			int math=sc.nextInt();
			System.out.println("영어 점수를 입력하세요");
			int eng=sc.nextInt();
			sc.nextLine();
			System.out.println("계속입력하시겠습니까? (q 또는 Q 이면 종료)");
			str=sc.nextLine();
			Student obj=new Student(name, kor, math, eng);
			as.add(obj);
		}while(!str.equalsIgnoreCase("q"));	// equalsIgnoreCase() : 대소문자 구분x  q or Q
		sc.close();
		
		
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
