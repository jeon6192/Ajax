package ex10_11_access_modifier_interface;

class Test implements Moveable {
	int x,y;
	String str;
	
	public Test(int x, int y, String str) {
		super();
		this.x = x;
		this.y = y;
		this.str = str;
	}

	public void moveTo(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
