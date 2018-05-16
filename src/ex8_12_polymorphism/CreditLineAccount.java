package ex8_12_polymorphism;

public class CreditLineAccount extends Account {
	int creditLine;
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine=creditLine;
	}
	
	// 오버라이딩
	int withdraw(int amount) throws Exception{
		if(balance+creditLine<amount) 
			throw new Exception("인출이 불가능 합니다");
		balance-=amount;
		return amount;
	}
	

}
