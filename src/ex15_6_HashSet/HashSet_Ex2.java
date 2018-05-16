package ex15_6_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Ex2 {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		// 데이터 저장
		set.add("자바");
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");
		System.out.println("저장된 데이터의 수 : "+set.size());		// 중복된 "자바"는 안들어가 있으ㅡㅡㅡ
		
		// set 객체가 보관하고 있는 데이터 객체 출력
		System.out.println(set);
		
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String str=iterator.next();
			System.out.println(str);
		}
	}
}
