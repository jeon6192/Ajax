package ex7_13_static_field1;

public class PhysicalMain {
	public static void main(String args[]) {
		PhysicalMain p=new PhysicalMain();
		PhysicalInfo obj=new PhysicalInfo("해리", 10, 132.0f, 35.0f);
		p.printPhysicalInfo(obj);
		
		obj.update(11, 145.0f, 45.0f);
		p.printPhysicalInfo(obj);
		
		obj.update(12, 157.0f);
		p.printPhysicalInfo(obj);
		
		obj.update(13);
		p.printPhysicalInfo(obj);
		
	}
	
void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("이름 : "+obj.name);
		System.out.println("나이 : "+obj.age);
		System.out.println("키 : "+obj.height);
		System.out.println("몸무게 : "+obj.weight);
		System.out.println();
	}
}
