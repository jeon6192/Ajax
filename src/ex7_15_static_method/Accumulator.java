package ex7_15_static_method;

public class Accumulator {
	int total=0;
	static int grandTotal=0;
	
	void accumulate(int amount) {
		total+=amount;
		grandTotal+=total;
	}
	static int getGrandTotal() {
		//total=5;
		return grandTotal;
	}
	
}
