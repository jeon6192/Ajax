package ex5_7_continue;

public class Test4 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%5==0)	continue;
			sum+=i;
		}
		System.out.println(sum);
	}
}