package ex8_19_interface_Multiple_inheritance;

class Label implements Changeable {
	String text;
	String foregruond;
	String background;
	String font;
	int width;
	int height;
	public Label(String text, String foregruond, String background, String font, int width, int height) {
		super();
		this.text = text;
		this.foregruond = foregruond;
		this.background = background;
		this.font = font;
		this.width = width;
		this.height = height;
	}
	@Override
	public void setForeground(String color) {
		this.foregruond=color;
	}
	@Override
	public void setBackground(String color) {
		this.background=color;
	}
	@Override
	public void resize(int width, int height) {
		this.width=width;
		this.height=height;
	}
	@Override
	public void setFont(String font) {
		this.font=font;
	}
	
	

}
