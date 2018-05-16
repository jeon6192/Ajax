package ex17_10_syn_format1;

class SharedArea {
	Account account1;
	Account account2;
	
	void transfer() {
		synchronized (this) {
			account1.withdraw(1000000);
			System.out.println("account1 ���� 100���� ����");
			
			account2.deposit(1000000);
			System.out.println("account2 ���� 100���� �Ա�");
		}
	}
	
	int getTotal() {
		synchronized (this) {
			return account1.balance+account2.balance;
		}
	}

}
