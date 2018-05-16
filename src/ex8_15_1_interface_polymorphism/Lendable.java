package ex8_15_1_interface_polymorphism;

interface Lendable {
	public abstract void checkOut(String borrower, String date);
	
	public abstract void checkIn();

}
