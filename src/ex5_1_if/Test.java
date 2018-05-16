package ex5_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		InputStream is=System.in;
		Scanner sc=new Scanner(is);
		int max=0,min=0,a,b,c;
		
		System.out.println("정수를 입력하세요 : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sc.close();
				
		if(a>b) {
			if(a>c)	max=a;
			if(a<c)	max=c;
		}else 	if(a<b) {
			if(b>c)	max=b;
			if(b<c)	max=c;
		}
		System.out.println("최대값 = "+max);
		if(a>b) {
			if(b>c)	min=c;
			if(b<c)	min=b;
		}else 	if(a<b) {
			if(a>c)	min=c;
			if(a<c)	min=a;
		}
		System.out.println("최소값 = "+min);
		
		
		
	}

}
