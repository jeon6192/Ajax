package ex8_17_interface_exception;

class SeparateVolume implements Lendable2{
	String requestNo;	// û����ȣ
	String bookTitle;	// ����
	String writer;			// ����
	String borrower;	// ������
	String checkOutDate;	// ������
	byte state;				// �������
	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		super();
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	@Override
	public void checkOut(String borrower, String date) throws Exception {
		if(state!=STATE_NORMAL)	throw new Exception("*����Ұ� : "+bookTitle);
		this.borrower=borrower;
		this.checkOutDate=date;
		this.state=STATE_BORROWED;
		System.out.println("*"+bookTitle+" ��(��) ����Ǿ����ϴ�.");
		System.out.println("������ : "+borrower);
		System.out.println("������ : "+date+"\n");
		
	}
	@Override
	public void checkIn() {
		this.borrower=null;
		this.checkOutDate=null;
		this.state=STATE_NORMAL;
		System.out.println("*"+bookTitle+" ��(��) �ݳ��Ǿ����ϴ�.\n");
		
	}
	

}