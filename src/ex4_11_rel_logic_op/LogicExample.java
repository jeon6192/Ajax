package ex4_11_rel_logic_op;

public class LogicExample {
	public static void main(String args[]) {
		boolean a,b;
		a=4>3;
		b=5>7;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		if(a&&b) {
			System.out.println("a&&b가 참");
		}
		if(a||b) {
			System.out.println("a||b가 참");
		}
		
	}
}
