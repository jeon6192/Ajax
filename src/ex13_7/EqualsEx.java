package ex13_7;

public class EqualsEx {
	public static void main(String[] args) {
		Circle obj1=new Circle(5);
		Circle obj2=new Circle(5);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		if(obj1.equals(obj2))	System.out.println("obj1.equals(obj2) ����");
		else	System.out.println("obj1.equals(obj2) �ٸ�");
		
		if(obj1==obj2)	System.out.println("obj1==obj2 ����");
		else	System.out.println("obj1==obj2 �ٸ�");
		
	}
}
