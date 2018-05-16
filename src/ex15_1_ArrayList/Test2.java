package ex15_1_ArrayList;

import java.util.GregorianCalendar;

public class Test2 {
	public static void main(String[] args) {
		GregorianCalendar g1=new GregorianCalendar(2018, 1, 27);
		GregorianCalendar g2=g1;
		GregorianCalendar g3=(GregorianCalendar)g1.clone();
		
	
		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
		System.out.println(g3.hashCode());
		
		MemberInfo obj1=new MemberInfo("馬馬", 20, "けいしけいし", "けいし");
		MemberInfo obj2=obj1;
		MemberInfo obj3=obj1.clone();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println("obj1.hashCode() : "+obj1.hashCode());
		System.out.println("obj2.hashCode() : "+obj2.hashCode());
		System.out.println("obj3.hashCode() : "+obj3.hashCode());
		
		System.out.println(g1==g2);
		System.out.println(g1==g3);
		System.out.println(obj1==obj2);
		System.out.println(obj1==obj3);
		System.out.println();
		System.out.println(g1.equals(g2));
		System.out.println(g1.equals(g3));
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		
		// https://blog.naver.com/travelmaps/220930144030
	}
}
