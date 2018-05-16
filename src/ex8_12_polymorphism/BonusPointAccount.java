package ex8_12_polymorphism;

public class BonusPointAccount extends Account {
	int bonusPoint;
	public BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint=bonusPoint;
	}
	
	// 오버라이딩
	void deposit(int amount) {
		super.deposit(amount);
		bonusPoint=(int)(amount*0.001);
	}
	
	
}
