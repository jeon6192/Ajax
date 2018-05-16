package ex17_14_state;

public class MonitorThread extends Thread{
	Thread thread;

	public MonitorThread(Thread thread) {
		super();
		this.thread = thread;
	}
	public void run() {
		while(true) {
			Thread.State state=thread.getState();
			System.out.println(thread.getName()+"ÀÇ »óÅÂ : "+state);
			
			try {
				Thread.sleep(20);
			}catch(Exception e) {}
			if(state==Thread.State.TERMINATED) break;
		}
	} // run
	
}