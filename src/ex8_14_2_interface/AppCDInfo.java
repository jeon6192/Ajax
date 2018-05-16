package ex8_14_2_interface;

public class AppCDInfo extends CDInfo implements Lendable {
	String borrower;
	String checkOutDate;
	byte state;

	public AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}

	@Override
	public void checkOut(String borrower, String date) {
		if(state!=0)	return;
		this.borrower=borrower;
		this.checkOutDate=date;
		this.state=1;
		System.out.println("*"+title+" ��(��) ����Ǿ����ϴ�.");
		System.out.println("������ : "+borrower);
		System.out.println("������ : "+date+"\n");
		
	}

	@Override
	public void checkIn() {
		this.borrower=null;
		this.checkOutDate=null;
		this.state=0;
		System.out.println("*"+title+" ��(��) �ݳ��Ǿ����ϴ�.\n");
		
	}
	

}
