package ex7_10_in_method_call;

public class Number2 {
	int[] num;
	public Number2(int[] num) {
		this.num=num;
	}
	int getTotal() {
		int total = 0;
		for(int i=0;i<num.length;i++) {
			total+=num[i];
		}
		return total;
	}
	int getAverage() {
		int average=getTotal()/num.length;
		return average;
	}

}
