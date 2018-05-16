package ex17_4_Runnable_Interface;

public class Multithread_Ex5 {
	public static void main(String[] args) {
		Thread t1=new Thread(new ThreadLife());
		// Runnable t1=new ThreadLife();
		
		Thread first=new Thread(t1,"first1");	// Thread 이름설정 해주는 생성자
		Thread second=new Thread(t1, "second1");
		Thread third=new Thread(t1, "third1");
		
		/*
		 * 	쓰레드는 우선순위라는 속성을 가지고있는데 이 우선순위의 값에 따라 쓰레드가 얻는 실행시간이 달라진다.
		 * 	최대우선순위 : public static final int MAX_PRIORITY=10;
		 * 	순위 미지정 : public static final int NORM_PRIORITY=10;
		 * 	최저우선순위 : public static final int MIN_PRIORITY=10;
		 */
		System.out.println("Thread의 우선순위");
		first.setPriority(Thread.MIN_PRIORITY);
		System.out.println("first priority : "+first.getPriority());
		second.setPriority(Thread.MAX_PRIORITY);
		System.out.println("second priority : "+second.getPriority());
		third.setPriority(3);
		System.out.println("third priority : "+third.getPriority());
		first.start();
		second.start();
		third.start();
	}
}
