package ex5_4_dowhile;

public class DoWhileEx {
	public static void main(String args[]) {
		int cnt=1;
		int sum=0;
		System.out.println("Ȧ���� ��");
		do {
			sum+=cnt;
			cnt+=2;
		}while(cnt<10);
		System.out.println(sum);
		
		cnt=2;
		sum=0;
		System.out.println("¦���� ��");
		do {
			sum+=cnt;
			cnt+=2;
		}while(cnt<=10);
		System.out.println(sum);
		
	}
}
