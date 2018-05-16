package ex13_9_getClass;

public class ClassEx {
	public static void main(String[] args) {
		Point p=new Point(5, 10);
		
		// Class 객체를 얻는방법
		// 1. 생성된 객체로부터 얻는 방법
		Class c1=p.getClass();
		// 2. 클래스 리터럴(.class)로 부터 얻는 방법
		Class c2=Point.class;
		// 3. 클래스 이름으로부터 얻는방법
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
