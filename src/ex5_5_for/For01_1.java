package ex5_5_for;

public class For01_1 {
	public static void main(String args[]) {
		int i;
		int sum=0;
		System.out.println("1씩 감소");
		for(i=1;i<=10;i++) {
			System.out.print(11+(~i+1)+" ");
		}
		
		System.out.println("\n"+"1~10까지의 합");		
		for(i=1;i<=10;i++)		sum+=i;
		System.out.println(sum);

		System.out.println("홀수 합");
		sum=0;
		for(i=1;i<=10;i+=2)	sum+=i;
		System.out.println(sum);

		System.out.println("짝수 합");
		sum=0;
		for(i=2;i<=10;i+=2)	sum+=i;
		System.out.println(sum);

	}
}