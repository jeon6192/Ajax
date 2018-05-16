package ex8_1_inheritance;

public class InheritanceEx {
	public static void main(String args[]) {
		CheckingAccount obj=new CheckingAccount();
		obj.accountNo="111-22-33333333";
		obj.ownerName="È«±æµ¿";
		obj.cardNo="5555-6666-7777-8888";
		obj.deposit(10);
		
		try {
			int paidAmount=obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("ÁöºÒ¾× : "+paidAmount);
			System.out.println("ÀÜ¾× : "+obj.balance);
			
			paidAmount=obj.pay("5555-6666-7777-8888", 3000);
			System.out.println("ÁöºÒ¾× : "+paidAmount);
			System.out.println("ÀÜ¾× : "+obj.balance);
		}catch(Exception e) {
			String msg=e.getMessage();
			System.out.println(msg);
		}
		
		
		
		
		
	}
}