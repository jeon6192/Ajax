package ex6_4_method;

import java.util.Scanner;

public class Method_Test {
	public static void main(String args[]) {
		int data[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("정수5개를 입력하세요");
		for(int i=0;i<data.length;i++) {
			data[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("최대값 = "+max(data));
		System.out.println("최소값 = "+min(data));
	}
	
	public static int max(int[] a) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) max=a[i];
		}
		return max;		
	}
	public static int min(int[] a) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) min=a[i];
		}
		return min;		
	}
	
}