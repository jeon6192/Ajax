package ex17_6_SharedArea_problem;

public class PrintThread extends Thread{
	SharedArea sharedArea;
	public synchronized void run() {
		System.out.println("���� ������ ������ : "+sharedArea.result);
	}
}