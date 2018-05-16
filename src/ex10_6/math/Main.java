package ex10_6.math;

import ex10_6.geometry.polygon.copy.*;

public class Main {
	public static void main(String[] args) {
		Square obj1=new Square(7);
		Rectangle obj2=new Rectangle(5, 10);
		if(obj1.getArea()>obj2.getArea())		System.out.println("정사각형의 면적이 더 넓습니다.");
		else	System.out.println("정사각형의 면적이 직사각형보다 작거나 같습니다.");
		System.out.println(obj1.toString());
	}

}