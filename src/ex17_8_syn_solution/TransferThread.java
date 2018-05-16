package ex17_8_syn_solution;

class TransferThread extends Thread{
	SharedArea sharedArea;
	
	public TransferThread(SharedArea area) {
		sharedArea=area;
	}
	public void run() {
		for(int cnt=0;cnt<12;cnt++) {
			synchronized (sharedArea) {
				sharedArea.account1.withdraw(1000000);
				System.out.println("account1 계좌 100만원 인출");
				sharedArea.account2.deposit(1000000);
				System.out.println("account2 계좌 100만원 입금");
			}
			
		}
	}

}
