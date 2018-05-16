package ex17_12_notify_wait;

public class PrintThread extends Thread{
	SharedArea sharedArea;
	public void run() {
		if(sharedArea.isReady!=true) {
			try {
				synchronized (sharedArea) {
					sharedArea.wait();
				}				
			} catch (InterruptedException e) {}
		}
		System.out.println("공유 영역의 데이터 : "+sharedArea.result);
		
	}
}