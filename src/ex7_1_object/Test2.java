package ex7_1_object;

import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		int data[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("����5���� �Է��ϼ���");
		for(int i=0;i<data.length;i++) {
			data[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("�ִ밪 = "+m(data,"max"));
		System.out.println("�ּҰ� = "+m(data,"min"));
	}
	
	public static int m(int[] a, String b) {
		int m=a[0];
		if(b.equals("max")) {
			for(int i=1;i<a.length;i++) {
				if(a[i]>m) m=a[i];
			}
		}
		if(b.equals("min")) {
			for(int i=1;i<a.length;i++) {
				if(a[i]<m) m=a[i];
			}
		}
		return m;
				
	}

}
