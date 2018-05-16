package ex17_13_notifyAll_wait;

public class LuxuryPrintThread extends Thread{
	SharedArea sharedArea;
	public void run() {
		if(sharedArea.isReady!=true) {
			try {
				synchronized (sharedArea) {
					sharedArea.wait();
				}				
			} catch (InterruptedException e) {}
		}
		System.out.println("*** ¥ð : "+sharedArea.result+" ***");
		
	}
}