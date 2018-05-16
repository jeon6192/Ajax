package ex17_11_syn_format2;

class SharedArea {
	Account account1;
	Account account2;
	
	synchronized void transfer() {
			account1.withdraw(1000000);
			System.out.println("account1 : "+account1.balance);
			
			account2.deposit(1000000);
			System.out.println("account2 : "+account2.balance);
	}
	
	synchronized int getTotal() {
			return account1.balance+account2.balance;
	}

}
