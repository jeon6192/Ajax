package ex17_4_Runnable_Interface;

public class ThreadLife implements Runnable {
	public void run() {
		for(int i=1;i<3;i++) {
			System.out.println("현재 실행중인 스레드의 이름은 "+Thread.currentThread().getName()+"이고, \tnumber : "+i);
		}
	}
	
	
}
