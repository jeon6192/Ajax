package ex17_1_Thread;

import java.util.Scanner;

public class ThreadExample1 {
	public static void main(String[] args) {
		System.out.println("아무거나 입력하세요");
		Thread t1=new ThreadExample2();
		t1.start();
		Scanner sc=new Scanner(System.in);
		System.out.println("입력하신 내용은 \'"+sc.nextLine()+"\' 입니다.");
		
		
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