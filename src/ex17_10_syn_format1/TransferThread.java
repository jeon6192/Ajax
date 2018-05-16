package ex17_10_syn_format1;

class TransferThread extends Thread{
	SharedArea sharedArea;
	
	public TransferThread(SharedArea area) {
		sharedArea=area;
	}
	public void run() {
		for(int cnt=0;cnt<12;cnt++) {
			sharedArea.transfer();
		}
	}

}
