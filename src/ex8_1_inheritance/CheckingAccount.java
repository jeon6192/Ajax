package ex8_1_inheritance;

public class CheckingAccount extends Account {
	String cardNo; // 직불카드 번호
	
	int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo)||balance<amount)
			throw new Exception("지불이 불가능합니다.");
		return withdraw(amount);
	}
}
