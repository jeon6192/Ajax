package ex8_18_interface_extends;

class Rectangle implements Transformable{
	int x,y,width,height;
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void moveTo(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public void moveBy(int xOffset, int yOffset) {
		this.x+=xOffset;
		this.y+=yOffset;
	}

	@Override
	public void resize(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
}
