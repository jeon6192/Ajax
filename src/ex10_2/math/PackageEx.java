package ex10_2.math;

import ex10_2.geometry.polygon.*;

class PackageEx {
	public static void main(String[] args) {
		Rectangle obj=new Rectangle(2, 3);
		Circle obj2=new Circle(3);
		if(obj.getArea()>obj2.getArea())	System.out.println("���� ������ ���簢���� �������� �۰ų� �����ϴ�.");
		else	System.out.println("���� ������ �� �н��ϴ�.");
	}

}