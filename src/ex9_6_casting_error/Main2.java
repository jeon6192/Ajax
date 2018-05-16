package ex9_6_casting_error;

class Main2 {
	public static void main(String args[]) {
		Account obj=new CheckingAccount("111-22-333333", "홍길동", 100000, "4444-5555-6666-7777");
		if(obj instanceof CheckingAccount) {
			pay((CheckingAccount)obj);
		}else {
			System.out.println("캐스트할 수 없는 타입입니다.");
		}
		
		
	}
	static void pay(CheckingAccount obj2) {
		try {
			int amount=obj2.pay("4444-5555-6666-7777", 47000);
			System.out.println("인출액 : "+amount);
			System.out.println("카드번호 : "+obj2.cardNo);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
