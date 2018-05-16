package ex13_9;

public class ShallowCopy {
	public static void main(String[] args) {
		Circle c1=new Circle(new Point(1, 1), 2.0);
		Circle c2=c1.clone();
		
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		
		c1.p.x=3;
		c1.p.y=5;
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		c2.setP(new Point(20, 30));
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		c2.p.x=10;
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		c2.r=3.0;
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		
		Circle c3=new Circle(5, 5, 5.0);
		Circle c4=c3.clone();
		System.out.println("c3 : "+c3);
		System.out.println("c4 : "+c4);
		c3.p.x=10;
		c3.p.y=10;
		System.out.println("c3 : "+c3);
		System.out.println("c4 : "+c4);
	}
	
}
