package ex17_11_syn_format2;

class PrintThread extends Thread{
	SharedArea sharedArea;
	
	public PrintThread(SharedArea area) {
		sharedArea=area;
	}
	public void run() {
		for(int cnt=0;cnt<3;cnt++) {
			int sum=sharedArea.getTotal();
			System.out.println("���� �ܾ� �հ� : "+sum);
			try {
				Thread.sleep(1);
			}catch(Exception e) {}
			
		}
	}

}
