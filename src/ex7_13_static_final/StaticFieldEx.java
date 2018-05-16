package ex7_13_static_final;

public class StaticFieldEx {
	public static void main(String args[]) {
		LimitedValue v=new LimitedValue();
		v.setValue(200000);
		System.out.println("v.value : "+v.value);
		System.out.println("상한값 = "+LimitedValue.UPPER_LIMIT);
		
		System.out.println("정수의 상한값 : "+Integer.MAX_VALUE);
		System.out.println("정수의 하한값 : "+Integer.MIN_VALUE);
	}

}
