package ex6_1_array;

import java.util.Scanner;

public class ArrayString2 {
	public static void main(String args[]) {
		String names[]= {"ȫ�浿","����ġ","ȫ�浿","�������","��浿"};
		System.out.println("�˻��� �̸�");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		int a=10;
		for(int i=0;i<names.length;i++) {
			if(str.equals(names[i])) {
				a=i;
				break;
			}
		}
		if(a==10) {
			System.out.println("x");
		}else {
			System.out.println(a);
		}
		
		
		
	}
}