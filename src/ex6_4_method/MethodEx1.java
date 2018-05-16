package ex6_4_method;

public class MethodEx1 {
	public static void main(String args[]) {
		int n1=10, n2=20;
		System.out.println("change 호출 전");
		System.out.println("n1 = "+n1);
		System.out.println("n2 = "+n2);
		
		change(n1, n2);
		System.out.println("change 호출 후");
		System.out.println("n1 = "+n1);
		System.out.println("n2 = "+n2);
		
		int[] data= {10,20};
		System.out.println("change 호출 전");
		System.out.println("data[0] = "+data[0]);
		System.out.println("data[1] = "+data[1]);
		
		change(data);
		System.out.println("change 호출 후");
		System.out.println("data[0] = "+data[0]);
		System.out.println("data[1] = "+data[1]);
	}
	public static void change(int a, int b) {
		int t=a;
		a=b;
		b=t;
	}
	public static void change(int[] a) {
		int t=a[0];
		a[0]=a[1];
		a[1]=t;
	}

}
