package ex7_1_object;

public class Saram {
	String name;
	double w;
	double ki;
	int age;
	
	public Saram(String name2, double w2, double ki2, int age2) {
		name=name2;
		w=w2;
		ki=ki2;
		age=age2;
	}

	public void eat() {
		System.out.println(name+"��(��) ���� �Դ´�.");
	}
	public void walk() {
		System.out.println("�ȱ��� �����Դ� "+w+"�Դϴ�.");
	}
	public void sesu() {
		System.out.println(name+"��(��) �����Ѵ�.");
	}

}
