package ex19_2_Serialization_error;

/*
 * 	 Serializable 인터페이스를 구현하면 자동으로 serialVersionUID라는 정적필드가 생성되는데
 * 	 클래스의 구성요소가 하나라도 변경되면 다른번호가 부여된다.
 * 	 하지만 명시적으로 선언시 컴파일시 추가되지 않기때문에 동일한 값을 유지할 수 있다.
 */

import java.io.Serializable;

public class Rectangle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5638581192325186843L;
	int width;
	int height;
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	int getArea() {
		return width*height; 
	}
	
}
