package ex17_6_SharedArea_solution;

public class PrintThread extends Thread{
	SharedArea sharedArea;
	public synchronized void run() {
		while(sharedArea.isReady!=true) {
			System.out.println("실행중");
		}
		System.out.println("공유 영역의 데이터 : "+sharedArea.result);
	}
}