package ex9_4_downcasting_error;

class Main {
	public static void main(String args[]) {
		Account obj=new CheckingAccount("111-22-333333", "ȫ�浿", 100000, "4444-5555-6666-7777");
		CheckingAccount obj2=(CheckingAccount) obj;
		
		try {
			int amount=obj2.pay("4444-5555-6666-7777", 47000);
			System.out.println("����� : "+amount);
			System.out.println("ī���ȣ : "+obj2.cardNo);
			System.out.println("�ܾ� : "+obj2.balance);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
