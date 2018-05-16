package ex17_4_Runnable_Interface;

public class Multithread_Ex3 {
	public static void main(String[] args) {
		Thread t1=new Thread(new ThreadLife());
		// Runnable t1=new ThreadLife();
		
		Thread first=new Thread(t1,"first1");	// Thread 이름설정 해주는 생성자
		Thread second=new Thread(t1, "second1");
		Thread third=new Thread(t1, "third1");
		
		first.start();
		second.start();
		third.start();
	}
}
