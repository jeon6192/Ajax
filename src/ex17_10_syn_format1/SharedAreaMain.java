package ex17_10_syn_format1;

public class SharedAreaMain {
	public static void main(String[] args) {
		SharedArea area=new SharedArea();
		
		area.account1=new Account("111-111-1111", "ÀÌ¸ù·æ", 20000000);
		area.account2=new Account("222-222-2222", "¼ºÃáÇâ", 10000000);
		
		TransferThread th1=new TransferThread(area);
		PrintThread th2=new PrintThread(area);
		th1.start();
		th2.start();
	}
}
