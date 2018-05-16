package ex7_13_static_field1;

public class Accumulator {
	int total=0;
	static int grandTotal=0;
	
	void accumulate(int amount) {
		total+=amount;
		grandTotal+=total;
	}
	
}
