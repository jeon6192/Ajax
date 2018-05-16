package ex8_14_2_interface;

interface Lendable {
	public abstract void checkOut(String borrower, String date);
	
	public abstract void checkIn();

}
