package ex5_7_continue;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		System.out.println("�� ���� �Է��ϼ��� : ");
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[2];
		int sum=0;
		int t;
		
		for(int a=0;a<2;a++) {
			arr[a]=sc.nextInt();
			if(arr[a]<0) {
				System.out.println("����� �Է��ϼ���");
				a--;
			}
		}				
		if(arr[1]<arr[0]) {
			t=arr[0];
			arr[0]=arr[1];
			arr[1]=t;
		}
		for(int k=arr[0];k<=arr[1];k++)		sum+=k;
		
		System.out.println(arr[0]+"~ "+arr[1]+"������ �� = "+sum);
		sc.close();	
		
	}
}
