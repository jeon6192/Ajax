package ex8_2_constructor;

public class CheckingAccount extends Account {
	String cardNo; // ����ī�� ��ȣ
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
		this.cardNo=cardNo;
	}
	
	int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo)||balance<amount)
			throw new Exception("������ �Ұ����մϴ�.");
		return withdraw(amount);
	}
}
