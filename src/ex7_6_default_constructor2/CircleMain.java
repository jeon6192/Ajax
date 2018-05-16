package ex7_6_default_constructor2;

public class CircleMain {
	public static void main(String args[]) {
		Circle c=new Circle(5.0);
		
		System.out.println("원의 반지름 : "+c.radius);
		double area=c.getArea();
		System.out.println("원의 넓이 : "+area);
	}
}
