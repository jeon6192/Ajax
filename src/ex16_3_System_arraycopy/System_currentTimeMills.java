package ex16_3_System_arraycopy;

public class System_currentTimeMills {
	public static void main(String[] args) {
		long time1=System.currentTimeMillis();
		System.out.println("시작 : "+time1);
		double total=0.0;
		for(int cnt=1;cnt<1000000000;cnt+=2) {
			if(cnt/2%2==0) 
				total+=1.0/cnt;
			else
				total-=1.0/cnt;
		}
		long time2=System.currentTimeMillis();
		double pi=total*4;
		System.out.println("끝 : "+time2);
		System.out.println("result : "+pi);
		System.out.println("계산에 "+(time2-time1)+"ms가 소요");
		System.out.printf("계산에 %f초가 소요\n", (float)(time2-time1)/1000);
		System.out.println("계산에 "+(double)(time2-time1)/1000+"초가 소요");
		
	}
}
