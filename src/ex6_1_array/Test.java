package ex6_1_array;

public class Test {
	public static void main(String[] args) { 
		String name[] = {"강호동", "이승기", "유재석", "하하","이광수"};
		String sub_name[] = {"국어", "수학","영어","총점","평균"};
	        int [][]score = { { 85,  60,  70},   //0행(강호동)
				  { 90,  95,  80},   //1행(이승기)
				  { 75,  80, 100},   //2행(유재석)
	              { 80,  70,  95},   //3행(하하)
				  {100,  65,  80}    //4행(이광수)
				};
	         int [] subject = new int[3]; //과목총점 저장 
	         int [] student = new int[5]; //학생의 총점 저장
	         int [] avg=new int[5];
	         //    subject[0]=0, student[0]=0;
	         //    subject와 student의 초기값 0으로 설정됨
	        
	        for(int i=0;i<score.length;i++) {
	        	for(int j=0;j<score[i].length;j++) {
	        		// 0,0  0,1  0,2  1,0  1,1  1,2  2,0  2,1  2,2
	        		student[i]+=score[i][j];
	        		subject[j]+=score[i][j];
	        	}
	        	avg[i]=student[i]/3;
	        }
	        /*System.out.println("각 과목별 총점구하기 ");
	        for(int i=0;i<sub_name.length-2;i++) {
	        	System.out.println(sub_name[i]+"의 총점 : "+subject[i]);
	        }
	        System.out.println("\n학생별 총점구하기");
	        for(int i=0;i<name.length;i++) {
	        	System.out.println(name[i]+"의 총점 : "+student[i]);
	        	avg[i]=student[i]/3;
	        }*/
	        
	        System.out.println("=========== 학생별 / 과목별 총점 구하기 ===========");
	        System.out.print("\t");
	        for(int i=0;i<sub_name.length;i++) {
	        	System.out.print(sub_name[i]+"\t");
	        }
	        System.out.println();
	        for(int i=0;i<5;i++) {
	        	System.out.print(name[i]+"\t");
	        	for(int j=0;j<3;j++) {
	        		System.out.print(score[i][j]+"\t");
	        	}
	        	System.out.print(student[i]+"\t"+avg[i]);
	        	System.out.println();
	        }
	        System.out.println("===========================================");
	        System.out.print("총점");
	        for(int i=0;i<3;i++) {
        		System.out.print("\t"+subject[i]);
        	}
	        
	}
}