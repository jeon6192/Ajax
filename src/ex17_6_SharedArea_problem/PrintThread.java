package ex17_6_SharedArea_problem;

public class PrintThread extends Thread{
	SharedArea sharedArea;
	public synchronized void run() {
		System.out.println("공유 영역의 데이터 : "+sharedArea.result);
	}
}