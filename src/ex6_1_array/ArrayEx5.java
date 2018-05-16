package ex6_1_array;

import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] num=new int[5];
		int sum=0;
		double avg;
		System.out.println("점수 5개를 입력하세요");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
			sum+=num[i];
		}
		sc.close();
		System.out.println("합 = "+sum);
		avg=sum/num.length;
		System.out.println("평균 = "+avg);
		

	}
}