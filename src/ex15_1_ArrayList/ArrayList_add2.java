package ex15_1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_add2 {
	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("하나");
		list.add(2);
		list.add(false);
		list.add(3.35);
		list.add("넷");
		list.add("five");
		list.add('A');
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"번째 : "+list.get(i));
		}
		
		Iterator elements=list.iterator();
		while(elements.hasNext()) {
			Object obj=elements.next();
			System.out.println(list.indexOf(obj)+" : "+obj);
			//System.out.println(elements.next());
		}
		
		System.out.println("==향상된 for문==");
		for(Object a:list) {
			System.out.println(a);
		}
		
		
	}
}
