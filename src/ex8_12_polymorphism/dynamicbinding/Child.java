package ex8_12_polymorphism.dynamicbinding;

public class Child extends Parent{
	public String message="Child";
	public void childPrn() {
		System.out.println("���� Ŭ���� : childPrn �޼���");
	}
	
	public void parentPrn() {
		System.out.println("���� Ŭ���� : parentPrn �޼���");
	}
}
