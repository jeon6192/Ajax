package ex8_17_interface_exception.copy;

class SeparateVolume implements Lendable2{
	String requestNo;	// 청구번호
	String bookTitle;	// 제목
	String writer;			// 저자
	String borrower;	// 대출인
	String checkOutDate;	// 대출일
	// byte state;				// 대출상태
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
		
		if(state==State.STATE_BORROWED)	throw new Exception("*대출불가 : "+bookTitle);
		this.borrower=borrower;
		this.checkOutDate=date;
		this.state=State.STATE_BORROWED;
		System.out.println("*"+bookTitle+" 이(가) 대출되었습니다.");
		System.out.println("대출인 : "+borrower);
		System.out.println("대출일 : "+date+"\n");
		
	}
	@Override
	public void checkIn(String borrower, String date) {
		this.borrower=borrower;
		this.checkOutDate=date;
		this.state=State.STATE_NORMAL;
		System.out.println("*"+bookTitle+" 이(가) 반납되었습니다.\n");
		
	}
	

}
