package ex17_15_join;

public class JoinMain {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" start");
		Thread myThread=new Thread(new MyRunnableTwo());
		myThread.start();
		try {
			myThread.join();		// join() �޼ҵ带 ȣ���� �����尡 ����ɶ����� ��ٸ�
		}catch(Exception e) {}
		
		System.out.println(Thread.currentThread().getName()+" end");
	}
}
