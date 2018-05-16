package ex17_13_notifyAll_wait;

public class SimplePrintThread2 extends Thread{
	SharedArea sharedArea;
	public void run() {
		if(sharedArea.isReady!=true) {
			try {
				synchronized (sharedArea) {
					sharedArea.wait();
				}				
			} catch (InterruptedException e) {}
		}
		System.out.printf("SimplePrint : %.2f %n",sharedArea.result);
		
	}
}