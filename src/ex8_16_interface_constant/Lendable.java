package ex8_16_interface_constant;

interface Lendable {
	final static byte STATE_BORROWED=1;
	final static byte STATE_NORMAL=0;
	
	public abstract void checkOut(String borrower, String date);
	
	public abstract void checkIn();
	

}
