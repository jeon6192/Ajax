package ex17_6_SharedArea_solution;

public class PrintThread extends Thread{
	SharedArea sharedArea;
	public synchronized void run() {
		while(sharedArea.isReady!=true) {
			System.out.println("������");
		}
		System.out.println("���� ������ ������ : "+sharedArea.result);
	}
}