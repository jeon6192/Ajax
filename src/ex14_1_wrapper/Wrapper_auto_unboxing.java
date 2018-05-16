package ex14_1_wrapper;

public class Wrapper_auto_unboxing {
	public static void main(String[] args) {
		Integer obj=new Integer("20");
		
		int sum=obj+10;	// == obj.intValue()+10
		System.out.println(sum);
		
	}
	
	
}
