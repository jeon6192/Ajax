package ex18_6_Buffered;

public class Student { 
	 String name; 
	 int  kor, eng,  math;
	 static int korTotal, engTotal, mathTotal,total;	 
	 static float totalavg;
	 Student(String name,int kor, int eng, int math){
		 this.name = name;
		 this.kor = kor;
		 this.eng = eng;
		 this.math = math;
		 //Student ������ ���� ���� ���� ���մϴ�.
		 korTotal += kor;
		 engTotal += eng;
		 mathTotal += math;
		 total+=(kor+eng+math);
		 totalavg=(total/3f);
	 }
	 
     int getTotal() {
    	 return kor + eng + math; 
     }
     
     float getAverage(){ 
    	 return (getTotal() / 3f);
     }
     
    
}