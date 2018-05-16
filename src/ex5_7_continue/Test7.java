package ex5_7_continue;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int i,j,k,sum;
		float f;
		i=sc.nextInt();
		j=sc.nextInt();
		k=sc.nextInt();
		sc.close();
		
		sum=i+j+k;
		f=(float)sum/3;
		System.out.println("총점 : "+sum);
		System.out.printf("%.2f\n", f);
		switch((int)f/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
	}
}