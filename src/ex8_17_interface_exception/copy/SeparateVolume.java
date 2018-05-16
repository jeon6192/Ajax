package ex8_17_interface_exception.copy;

class SeparateVolume implements Lendable2{
	String requestNo;	// û����ȣ
	String bookTitle;	// ����
	String writer;			// ����
	String borrower;	// ������
	String checkOutDate;	// ������
	// byte state;				// �������
	State state;
	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		super();
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
		this.state=State.STATE_NORMAL;
	}
	@Override
	public void checkOut(String borrower, String date) throws Exception {
		
		if(state==State.STATE_BORROWED)	throw new Exception("*����Ұ� : "+bookTitle);
		this.borrower=borrower;
		this.checkOutDate=date;
		this.state=State.STATE_BORROWED;
		System.out.println("*"+bookTitle+" ��(��) ����Ǿ����ϴ�.");
		System.out.println("������ : "+borrower);
		System.out.println("������ : "+date+"\n");
		
	}
	@Override
	public void checkIn(String borrower, String date) {
		this.borrower=borrower;
		this.checkOutDate=date;
		this.state=State.STATE_NORMAL;
		System.out.println("*"+bookTitle+" ��(��) �ݳ��Ǿ����ϴ�.\n");
		
	}
	

}
