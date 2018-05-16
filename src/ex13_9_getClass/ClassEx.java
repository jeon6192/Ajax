package ex13_9_getClass;

public class ClassEx {
	public static void main(String[] args) {
		Point p=new Point(5, 10);
		
		// Class ��ü�� ��¹��
		// 1. ������ ��ü�κ��� ��� ���
		Class c1=p.getClass();
		// 2. Ŭ���� ���ͷ�(.class)�� ���� ��� ���
		Class c2=Point.class;
		// 3. Ŭ���� �̸����κ��� ��¹��
		Class c3=null;
		try {
			c3=Class.forName("ex13_9_getClass.Point");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c1.toString());
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c1.getName());
		System.out.println(c1.toGenericString());
		
		
	}
}
