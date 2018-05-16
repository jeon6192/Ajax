package ex7_1_object;

import java.util.Scanner;

public class Test3 {
	public static void main(String args[]) {
		int data[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("정수5개를 입력하세요");
		for(int i=0;i<data.length;i++) {
			data[i]=sc.nextInt();
		}
		int[] result=max_min(data);
		sc.close();
		System.out.println("최대값 = "+result[0]);
		System.out.println("최소값 = "+result[1]);
	}
	
	public static int[] max_min(int[] a) {
		int[] r=new int[] {a[0],a[0]};
		for(int i=1;i<a.length;i++) {
			if(a[i]>r[0]) r[0]=a[i];
			if(a[i]<r[1]) r[1]=a[i];
			} 
		return r;
	}

}
