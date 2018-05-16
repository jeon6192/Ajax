package ex7_10_in_method_call;

public class MethodEx {
	public static void main(String args[]){
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		Number2 obj=new Number2(arr);
		
		System.out.println("ÇÕ°è : "+obj.getTotal());
		System.out.println("Æò±Õ : "+obj.getAverage());
	}
}
