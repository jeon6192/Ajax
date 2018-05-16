package ex7_6_default_constructor2;

public class Circle {
	double radius;
	final double PI=3.14;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double getArea() {
		double area=this.radius*this.radius*PI;
		return area;
	}
}
