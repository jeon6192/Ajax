package ex5_5_for;

public class For01_1 {
	public static void main(String args[]) {
		int i;
		int sum=0;
		System.out.println("1�� ����");
		for(i=1;i<=10;i++) {
			System.out.print(11+(~i+1)+" ");
		}
		
		System.out.println("\n"+"1~10������ ��");		
		for(i=1;i<=10;i++)		sum+=i;
		System.out.println(sum);

		System.out.println("Ȧ�� ��");
		sum=0;
		for(i=1;i<=10;i+=2)	sum+=i;
		System.out.println(sum);

		System.out.println("¦�� ��");
		sum=0;
		for(i=2;i<=10;i+=2)	sum+=i;
		System.out.println(sum);

	}
}