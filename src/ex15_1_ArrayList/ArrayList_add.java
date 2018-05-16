package ex15_1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_add {
	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("ÇÏ³ª");
		list.add(2);
		list.add(false);
		list.add(3.35);
		list.add("³İ");
		list.add("five");
		list.add('A');
		
		System.out.println(list);
		System.out.println(list.get(2));
	}
}
