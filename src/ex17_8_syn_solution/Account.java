package ex17_8_syn_solution;

public class Account {
	String accountNo; //���¹�ȣ
	String ownerName; //������ �̸�
	int balance; //�ܾ�
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	void deposit(int amount) {
		balance+=amount;
	}
	void withdraw(int amount) {
		balance-=amount;
	}

	
}