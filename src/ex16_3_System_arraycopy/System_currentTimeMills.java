package ex16_3_System_arraycopy;

public class System_currentTimeMills {
	public static void main(String[] args) {
		long time1=System.currentTimeMillis();
		System.out.println("���� : "+time1);
		double total=0.0;
		for(int cnt=1;cnt<1000000000;cnt+=2) {
			if(cnt/2%2==0) 
				total+=1.0/cnt;
			else
				total-=1.0/cnt;
		}
		long time2=System.currentTimeMillis();
		double pi=total*4;
		System.out.println("�� : "+time2);
		System.out.println("result : "+pi);
		System.out.println("��꿡 "+(time2-time1)+"ms�� �ҿ�");
		System.out.printf("��꿡 %f�ʰ� �ҿ�\n", (float)(time2-time1)/1000);
		System.out.println("��꿡 "+(double)(time2-time1)/1000+"�ʰ� �ҿ�");
		
	}
}
