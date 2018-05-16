package ex10_9.main;

import ex10_9.geometry.shape.Square;

public class AccessControlExample {

	public static void main(String[] args) {
		Square obj=new Square(100, 200, 15);
		for(int i=0;i<4;i++) {
			System.out.println("x["+i+"]="+obj.getX(i)+"\t y["+i+"]="+obj.getY(i));
		}
		for(int i=0;i<4;i++) {
			System.out.printf("(%3d,%3d)\n",obj.getX(i),obj.getY(i));
		}

	}

}
