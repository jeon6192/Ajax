package ex4_12_conditional_op;

import java.io.InputStream;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		InputStream is=System.in;
		Scanner sc=new Scanner(is);
		int max,min,a,b,c;
		
		System.out.println("정수를 입력하세요 : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sc.close();
				
		// max=a>b?a:b;
		// max=max>c?max:c;
		max=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("최대값 = "+max);
		min=a<b?(a<c?a:c):(b<c?b:c);
		System.out.println("최소값 = "+min);
		
		
		
	}

}
