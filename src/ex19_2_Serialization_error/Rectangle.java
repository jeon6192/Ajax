package ex19_2_Serialization_error;

/*
 * 	 Serializable �������̽��� �����ϸ� �ڵ����� serialVersionUID��� �����ʵ尡 �����Ǵµ�
 * 	 Ŭ������ ������Ұ� �ϳ��� ����Ǹ� �ٸ���ȣ�� �ο��ȴ�.
 * 	 ������ ��������� ����� �����Ͻ� �߰����� �ʱ⶧���� ������ ���� ������ �� �ִ�.
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
