package ex17_4_Runnable_Interface;

public class Multithread_Ex4 {
	public static void main(String[] args) {
		Thread t1=new Thread(new ThreadLife());
		// Runnable t1=new ThreadLife();
		
		Thread first=new Thread(t1,"first1");	// Thread �̸����� ���ִ� ������
		Thread second=new Thread(t1, "second1");
		Thread third=new Thread(t1, "third1");
		
		/*
		 * 	������� �켱������� �Ӽ��� �������ִµ� �� �켱������ ���� ���� �����尡 ��� ����ð��� �޶�����.
		 * 	�ִ�켱���� : public static final int MAX_PRIORITY=10;
		 * 	���� ������ : public static final int NORM_PRIORITY=10;
		 * 	�����켱���� : public static final int MIN_PRIORITY=10;
		 */
		System.out.println("Thread�� �켱����");
		System.out.println("first priority : "+first.getPriority());
		System.out.println("second priority : "+second.getPriority());
		System.out.println("third priority : "+third.getPriority());
		first.start();
		second.start();
		third.start();
	}
}
