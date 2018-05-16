package ex17_3_Thread_four;

import ex17_1_Thread.DigitThread;

public class MuktithreadEx {
	public static void main(String[] args) {
		Thread th1=new DigitThread();
		Thread th2=new DigitThread();
		Thread th3=new Thread_Ex3();
		th1.start();
		try {
			Thread.sleep(330);
			th2.start();
			Thread.sleep(660);
			th3.start();
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}