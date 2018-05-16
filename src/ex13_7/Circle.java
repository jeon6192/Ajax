package ex13_7;

public class Circle {
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Circle))
			return false;
		Circle circle=(Circle)obj;
		if(radius==circle.radius)
			return true;
		else
			return false;
	}
	

}
