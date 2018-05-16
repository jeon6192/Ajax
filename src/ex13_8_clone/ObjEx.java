package ex13_8_clone;

import java.util.GregorianCalendar;

public class ObjEx {
	public static void main(String[] args) {
		GregorianCalendar obj1=new GregorianCalendar(2007, 0, 1);
		GregorianCalendar obj2=(GregorianCalendar)obj1.clone();
		
		System.out.printf("%tF \n",obj1);	// %tF : 날짜를 YYYY-MM-DD 형식으로 출력
		System.out.printf("%tF \n",obj2);
		
		obj1.set(2018, 1, 26);
		System.out.printf("%tF \n",obj1);
		System.out.printf("%tF \n",obj2);
		
		String name=ObjEx.class.getName();
		System.out.println(name);
	}
}
