package ex13_8_clone;

public class RecEx {
	public static void main(String[] args) {
		Rectangle obj1=new Rectangle(10, 20);
		Rectangle obj2=(Rectangle)obj1.clone();
		System.out.println("obj1 : "+obj1.width+", "+obj1.height);
		System.out.println("obj2 : "+obj2.width+", "+obj2.height);
		
		obj1.setWidth(20);
		obj1.setHeight(30);
		System.out.println("obj1 : "+obj1.width+", "+obj1.height);
		System.out.println("obj2 : "+obj2.width+", "+obj2.height);
	}
}
