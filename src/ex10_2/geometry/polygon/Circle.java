package ex10_2.geometry.polygon;

public class Circle {
	public int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public double getArea() {
		return radius*radius*3.14;
	}

}
