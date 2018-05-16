package ex7_1_object;

public class ObjectEx1 {
	public static void main(String args[]) {
		StringBuffer obj=new StringBuffer("Hey, Java");
		obj.deleteCharAt(1);
		obj.deleteCharAt(1);
		obj.insert(1, 'i');
		System.out.println(obj);
	}
}
