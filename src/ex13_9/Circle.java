package ex13_9;

public class Circle implements Cloneable{
	Point p;
	double r;
	public Circle(Point p, double r) {
		super();
		this.p = p;
		this.r = r;
	}
	public Circle(int x, int y, double r) {
		this.p=new Point(x, y);
		this.r=r;
	}
	public String toString() {
		return "[p="+p+", r="+r+"]";
	}
	
	public void setP(Point p) {
		this.p = p;
	}
	public void setR(double r) {
		this.r = r;
	}
	public Circle clone() {
		try {
			return (Circle)super.clone();
		}catch(CloneNotSupportedException e) {
			return null;			
		}
	}
}
