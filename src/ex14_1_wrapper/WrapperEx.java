package ex14_1_wrapper;

import java.util.Scanner;

public class WrapperEx {
	public static void main(String[] args) {
		String a,b;
		int max,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("두 수 입력");
		a=sc.next();
		b=sc.next();
		sc.close();
		
		max=max(Integer.parseInt(a), Integer.parseInt(b));
		min=min(Integer.parseInt(a), Integer.parseInt(b));
		
		
		System.out.println("max : "+max);
		System.out.println("min : "+min);
	}

	public static int max(int a, int b) {
		int max;
		if(a>b)	max=a;
		else	max=b;
		return max;
	}
	public static int min(int a, int b) {
		int min;
		if(a>b)	min=b;
		else	min=a;
		return min;
	}
}
