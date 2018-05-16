package ex10_2.math;

import ex10_2.geometry.polygon.*;

class PackageEx {
	public static void main(String[] args) {
		Rectangle obj=new Rectangle(2, 3);
		Circle obj2=new Circle(3);
		if(obj.getArea()>obj2.getArea())	System.out.println("원의 면적은 직사각형의 면적보다 작거나 같습니다.");
		else	System.out.println("원의 면적이 더 넓습니다.");
	}

}