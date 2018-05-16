package ex4_11_rel_logic_op;

public class CompExample1 {
	public static void main(String args[]) {
		System.out.println(3<4);
		System.out.println(10>20.0);
		System.out.println(12.5f<=11);
		System.out.println(7>=7);
		
		int a=10, b=4;
		boolean test;
		test=a>b;
		System.out.println(a+">"+b+"="+test);
		test=a<b;
		System.out.println(a+"<"+b+"="+test);
		System.out.println(a+b>a-b);
	}
}
