package ex17_7_syn_problem;

class TransferThread extends Thread{
	SharedArea sharedArea;
	
	public TransferThread(SharedArea area) {
		sharedArea=area;
	}
	public void run() {
		for(int cnt=0;cnt<12;cnt++) {
			sharedArea.account1.withdraw(1000000);
			System.out.println("account1 ���� 100���� ����");
			sharedArea.account2.deposit(1000000);
			System.out.println("account2 ���� 100���� �Ա�");
		}
	}

}