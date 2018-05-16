package ex8_19_interface_Multiple_inheritance;

class LabelMain {
	public static void main(String[] args) {
		Label obj=new Label("æ»≥Á«œººø‰", "yellow", "green", "±º∏≤√º", 100, 30);
		printLabel(obj);
		obj.resize(200, 70);
		obj.setForeground("black");
		obj.setForeground("white");
		obj.setFont("±√º≠√º");
		printLabel(obj);
	}
	static void printLabel(Label obj) {
		System.out.println("text : "+obj.text);
		System.out.printf("size : %3d, %3d\n",obj.width,obj.height);
		System.out.println("foreground : "+obj.foregruond);
		System.out.println("background : "+obj.background);
		System.out.println("font : "+obj.font);
		System.out.println();
	}

}
