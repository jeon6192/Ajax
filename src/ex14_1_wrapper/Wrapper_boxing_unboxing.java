package ex14_1_wrapper;

public class Wrapper_boxing_unboxing {
	public static void main(String[] args) {
		Integer obj1=new Integer(12);
		Integer obj2=new Integer(7);
		
		int n1=obj1.intValue();
		int n2=obj2.intValue();
		int sum=n1+n2;
		System.out.println(sum);
		
		Integer n02=new Integer("20");
		int n3=n02.intValue();
		System.out.println(n3);
		String s=new String("30");
		Integer it=new Integer(s);
		int n4=it.intValue();
		System.out.println(n4);
	}
}
