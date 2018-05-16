package ex17_14_state;

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
		if(this.getState()==Thread.State.RUNNABLE)	 System.out.println("run");
		System.out.println("\n���� ������ ������ : "+sharedArea.result+"\n");
	}
}