package ex18_4_DataIOStream;

public class Student { 
	 String name; 
	 int  kor, eng,  math;
	 static int korTotal, engTotal, mathTotal;	 
	 Student(String name,int kor, int eng, int math){
		 this.name = name;
		 this.kor = kor;
		 this.eng = eng;
		 this.math = math;
		 //Student ������ ���� ���� ���� ���մϴ�.
		 korTotal += kor;
		 engTotal += eng;
		 mathTotal += math;
	 }
	 
     int getTotal() {
    	 return kor + eng + math; 
     }
     
     float getAverage(){ 
    	 return (getTotal() / 3f);
     }
     
    
}