package ex17_10_syn_format1;

class SharedArea {
	Account account1;
	Account account2;
	
	void transfer() {
		synchronized (this) {
			account1.withdraw(1000000);
			System.out.println("account1 계좌 100만원 인출");
			
			account2.deposit(1000000);
			System.out.println("account2 계좌 100만원 입금");
		}
	}
	
	int getTotal() {
		synchronized (this) {
			return account1.balance+account2.balance;
		}
	}

}
