package ex17_1_Thread;

import java.util.Scanner;

public class ThreadExample1 {
	public static void main(String[] args) {
		System.out.println("�ƹ��ų� �Է��ϼ���");
		Thread t1=new ThreadExample2();
		t1.start();
		Scanner sc=new Scanner(System.in);
		System.out.println("�Է��Ͻ� ������ \'"+sc.nextLine()+"\' �Դϴ�.");
		
		
		sc.close();
	}
}

class ThreadExample2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}