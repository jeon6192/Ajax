package ex15_1_ArrayList;

public class Student {
	String name;
	int kor;
	int math;
	int eng;
	int rank;
	static int korTotal;
	static int mathTotal;
	static int engTotal;
	
	
	public Student(String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;		
		this.math = math;
		this.eng = eng;
		this.rank=1;
		korTotal+=kor;
		mathTotal+=math;
		engTotal+=eng;
	}
	
	int getTotal() {
		int total;
		total=kor+eng+math;		
		return total;
	}
	float getAverage() {
		float average;
		average=Math.round((float)getTotal()/3*10);
		return average/10;
	}
		
}