package ex5_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		InputStream is=System.in;
		Scanner sc=new Scanner(is);
		
		int listcount,limit,maxpage;
		System.out.print("limit�� �Է��ϼ��� : ");
		limit=sc.nextInt();
		System.out.print("listcount�� �Է��ϼ��� : ");
		listcount=sc.nextInt();
		maxpage=(listcount-1)/limit+1;
		System.out.print("maxpage = "+maxpage);
		sc.close();
		
	}
}