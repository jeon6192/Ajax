package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayList_method {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>(10);
		list1.add("봄");
		list1.add("여름");		
		ArrayList<String> list2=new ArrayList<String>(10);
		list2.add("봄");
		list2.add("가을");
		list2.add("겨울");
		
		// 차집합 list2 - list1
		list2.removeAll(list1);
		System.out.println(list1);
		System.out.println(list2);
		
		
		ArrayList<String> list3=new ArrayList<String>(10);
		list3.add("봄");
		list3.add("여름");
		ArrayList<String> list4=new ArrayList<String>(10);
		list4.add("봄");
		list4.add("가을");
		list4.add("겨울");
		
		list4.addAll(list3);
		System.out.println(list3);
		System.out.println(list4);
		
		
		if(list1.contains("봄")) {
			System.out.println("봄이 존재합니다.");
		}else {
			System.out.println("봄이 존재하지 않습니다.");
		}
		
		
	}
}
