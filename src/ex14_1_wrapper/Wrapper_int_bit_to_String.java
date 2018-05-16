package ex14_1_wrapper;

public class Wrapper_int_bit_to_String {
	public static void main(String[] args) {
		int total=0;
		for(int i=0;i<args.length;i++) {
			total+=Integer.parseInt(args[i]);
		}
		System.out.println(Integer.toBinaryString(total));
		System.out.println(Integer.toOctalString(total));
		System.out.println(Integer.toHexString(total));
		
	}
}
