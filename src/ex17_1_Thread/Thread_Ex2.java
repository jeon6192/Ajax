package ex17_1_Thread;

public class Thread_Ex2 extends Thread {
	public static void main(String[] args) {
		Thread t1=new DigitThread();
		t1.start();
		for(char ch='a';ch<='z';ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
