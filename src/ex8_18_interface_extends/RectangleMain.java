package ex8_18_interface_extends;

class RectangleMain {
	public static void main(String args[]) {
		Rectangle obj=new Rectangle(100, 200, 10, 10);
		printRectangle(obj);
		obj.moveTo(25, 35);
		printRectangle(obj);
		obj.moveBy(-5, -5);
		printRectangle(obj);
		obj.resize(30, 30);
		printRectangle(obj);
	}
	static void printRectangle(Rectangle obj) {
		System.out.println("�簢�� : ��ġ("+obj.x+", "+obj.y+") ũ��("+obj.width+"x"+obj.height+")");
	}

}
