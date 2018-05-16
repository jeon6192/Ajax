package ex15_1_ArrayList;

import java.util.ArrayList;

/*
 * 	ArrayList에 있는 데이터를 검색하는 예
 * 	- indexOf(data) : 인자와 같은 값을 갖는 첫 번째 데이터를 찾아서 그 위치의 인덱스를 리턴
 *  - lastIndexOf(data) : 인자와 같은 값을 마지막부터 순서대로 데이터를 찾아가서 그 위치의 인덱스를 리턴
 *  - 인자와 같은 값이 없으면 -1을 리턴
 */

public class ArrayList_index {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("하나");
		list.add("하나");
		list.add("하나");
		list.add("하나");
		list.add("하나");
		
		int index1=list.indexOf("하나");
		int index2=list.lastIndexOf("하나");
		System.out.println(index1);
		System.out.println(index2);
	}
}
