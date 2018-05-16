package ex6_3_method_intro;

public class MethodEx1_2_before {
	public static void main(String args[]) {
		/*int sum=0;
		for(int i=1;i<=10;i++)	sum+=i;
		System.out.println("합(1~10) : "+sum);
		
		sum=0;
		for(int i=1;i<=100;i++)	sum+=i;
		System.out.println("합(1~100) : "+sum);*/
		
		getSum(10);
		getSum(100);
		System.out.println("합(1~1000) : "+getSum2(1000));
		System.out.println(add(3, 4));
		
	}
	
	public static void getSum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) sum+=i;
		System.out.println("합(1~"+num+") : "+sum);
	}
	public static int getSum2(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) sum+=i;
		return sum;
	}
	public static int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	
}