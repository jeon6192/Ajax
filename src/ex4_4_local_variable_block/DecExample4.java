package ex4_4_local_variable_block;

public class DecExample4 {

	public static void main(String args[]) {
		{
			int num=10;
		}
		int num=20;
		System.out.println(num);
		
		final double PI=3.14;
		double radius=2.0;
		System.out.println("원주율 : "+PI);
		System.out.println("원의 둘레 : "+2*radius*PI);
		System.out.println("원의 넓이 : "+radius*radius*PI);
		
		int a=10,b=4,c;
		double d;
		c=a+b;
		System.out.println(a+"+"+b+"="+c);
		c=a-b;
		System.out.println(a+"-"+b+"="+c);
		c=a*b;
		System.out.println(a+"*"+b+"="+c);
		d= ((double)a/(double)b);
		System.out.println(a+"/"+b+"="+d);
	}
	
}
