package ex7_8_private_field;

class Circle {
	double radius;
	final double PI=3.14;
	
	Circle(double radius) {
		this.radius=radius;
	}
	
	double getArea() {
		double area=this.radius*this.radius*PI;
		return area;
	}
}
