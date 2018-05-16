package ex8_2_constructor;

public class InheritanceEx {
	public static void main(String args[]) {
		CheckingAccount obj=new CheckingAccount("111-22-33333333", "È«±æµ¿", 0, "5555-6666-7777-8888");
		obj.deposit(10000);
		
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