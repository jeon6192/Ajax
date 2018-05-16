package ex7_13_static_final;

public class StudentMain {
	public static void main(String args[]) {
		Student obj1=new Student("강호동", 85, 60, 70);
		Student obj2=new Student("이승기", 90, 95, 80);
		Student obj3=new Student("유재석", 75, 80, 100);
		Student obj4=new Student("하하", 80, 70, 95);
		Student obj5=new Student("이광수", 100, 65, 80);
		Student[] arr=new Student[]{obj1,obj2,obj3,obj4,obj5};
		getRank(arr);
		sort(arr);
		System.out.print("=============    학생별   /  과목별 총점구하기  =============\n\t");
		System.out.print("국어\t수학\t영어\t총점\t평균\t등수\n");
		for(int i=0;i<arr.length;i++) printStudent(arr[i]);
		System.out.println("====================================================");
		System.out.println("총점\t"+Student.korTotal+"\t"+Student.mathTotal+"\t"+Student.engTotal);		
	}
	static void printStudent(Student obj) {
		System.out.println(obj.name+"\t"+obj.kor+"\t"+obj.math+"\t"+obj.eng+"\t"+obj.getTotal()+"\t"+obj.getAverage()+"\t"+obj.rank);
	}
	static void getRank(Student[] arr) {
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length;j++)
				if(arr[i].getTotal()<arr[j].getTotal()) 	arr[i].rank=arr[i].rank+1;
	}
	static void sort(Student[] obj) {
		for(int i=0;i<obj.length;i++) {
			for(int j=0;j<obj.length-1-i;j++) {
				if(obj[j].rank>obj[j+1].rank) {
					Student temp=obj[j];
					obj[j]=obj[j+1];
					obj[j+1]=temp;
				}		
			}
		}
	}	// sort
	
} // main