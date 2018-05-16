package ex8_16_interface_constant;

class SeparateVolume implements Lendable{
	String requestNo;	// 청구번호
	String bookTitle;	// 제목
	String writer;			// 저자
	String borrower;	// 대출인
	String checkOutDate;	// 대출일
	byte state;				// 대출상태
	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		super();
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	@Override
	public void checkOut(String borrower, String date) {
		if(state!=STATE_NORMAL)	return;
		this.borrower=borrower;
		this.checkOutDate=date;
		this.state=STATE_BORROWED;
		System.out.println("*"+bookTitle+" 이(가) 대출되었습니다.");
		System.out.println("대출인 : "+borrower);
		System.out.println("대출일 : "+date+"\n");
		
	}
	@Override
	public void checkIn() {
		this.borrower=null;
		this.checkOutDate=null;
		this.state=STATE_NORMAL;
		System.out.println("*"+bookTitle+" 이(가) 반납되었습니다.\n");
		
	}
	

}
