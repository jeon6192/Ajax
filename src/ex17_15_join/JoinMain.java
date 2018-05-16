package ex17_15_join;

public class JoinMain {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" start");
		Thread myThread=new Thread(new MyRunnableTwo());
		myThread.start();
		try {
			myThread.join();		// join() 메소드를 호출한 쓰레드가 종료될때까지 기다림
		}catch(Exception e) {}
		
		System.out.println(Thread.currentThread().getName()+" end");
	}
}
