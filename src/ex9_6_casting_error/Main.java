package ex9_6_casting_error;

class Main {
	public static void main(String args[]) {
		Account obj1 = new Account("111-11-111111","�̼���",5000);
    	Account obj2 = new Account("222-22-222222","������",7000);
      Account obj3 = 
       new CheckingAccount("111-22-33333333", "ȫ�浿", 10, 
    		   "4444-5555-6666-7777");
      Account obj4 = new Account("333-33-333333","�ְ��",6000);
      printAccountInfo(obj1);
      printAccountInfo(obj2);
      printAccountInfo(obj3);
      printAccountInfo(obj4);
      
    }
    static void printAccountInfo(Account obj){
    	System.out.println("���¹�ȣ:" + obj.accountNo);
        System.out.println("������ �̸�:" + obj.ownerName);
        System.out.println("�ܾ�:" + obj.balance);
        if(obj instanceof CheckingAccount) {
        	CheckingAccount obj2=(CheckingAccount)obj;
        	System.out.println("ī���ȣ : "+obj2.cardNo);
        }
        System.out.println();
    }
}
