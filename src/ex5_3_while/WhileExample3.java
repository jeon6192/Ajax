package ex5_3_while;

public class WhileExample3 {
	public static void main(String args[]) {
		System.out.println("==1~10������ ��==");
		int sum=0;
		int i=1;
		while(i<=10) {
			sum+=i;
			i=i+1;
		}
		System.out.println(sum);
		
		System.out.println("==¦���� ��==");
		sum=0;
		i=2;
		while(i<=10) {
			sum+=i;
			i+=2;
		}
		System.out.println(sum);
		
		System.out.println("==Ȧ���� ��==");
		sum=0;
		i=1;
		while(i<=10) {
			sum+=i;
			i+=2;
		}
		System.out.println(sum);
		
	}
}
