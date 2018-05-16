package ex10_6.geometry.polygon.copy;

public class Square {
	public int sideLength;

	public Square(int sideLength) {
		super();
		this.sideLength = sideLength;
	}
	public double getArea() {
		return sideLength*sideLength;
	}

}
