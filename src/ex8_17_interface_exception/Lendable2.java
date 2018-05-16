package ex8_17_interface_exception;

interface Lendable2 {
	final static byte STATE_BORROWED=1;
	final static byte STATE_NORMAL=0;
	
	public abstract void checkOut(String borrower, String date) throws Exception;
	
	public abstract void checkIn();
	

}
