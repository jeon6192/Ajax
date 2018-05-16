package ex13_8_clone;

class Rectangle implements Cloneable{
    int width, height;
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }  
    
	public boolean equals(Object obj) {
		if(!(obj instanceof Rectangle))
			return false;
		Rectangle rec=(Rectangle)obj;
		if(width==rec.width && height==rec.height)
			return true;
		else
			return false;
	}	
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public String toString() {
		String str;
		str="가로는 "+width+", 세로는 "+height;
		return str;
	}
	
	/*		x.clone() != x
			will be true, and that the expression: 
			 x.clone().getClass() == x.getClass()
			will be true, but these are not absolute requirements. While it is typically the case that: 
			 x.clone().equals(x)
			will be true*/
	public Object clone() {
		try{
			return super.clone();
		}catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
}    