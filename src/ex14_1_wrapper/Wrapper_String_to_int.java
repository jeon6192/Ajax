package ex14_1_wrapper;

public class Wrapper_String_to_int {
	public static void main(String[] args) {
		int total=0;
		int total2=0;
		for(int i=0;i<args.length;i++) {
			Integer obj=new Integer(args[i]);
			total+=obj;
		}
		System.out.println(total);
		
		for(int i=0;i<args.length;i++) {
			total2+=Integer.parseInt(args[i]);
		}
		System.out.println(total2);
		
		
	}
}
