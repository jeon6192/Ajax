package ex15_3_Vector;

import java.util.Vector;

/*
 * 	Vector 클래스 - ArrayList의 구버전, List와 거의 비슷, 둘 중에 List를 더 많이 사용
 * 		1. 여러가지 자료형의 Data를 모두 저장할 수 있습니다.
 * 			ex) int, double, char, boolean, String etc
 * 		2. 순서있는 입,출력 처리(index번호 순으로 저장됨)
 * 		3. 중복된 Data를 저장 할 수 있습니다.
 * 		4. 입출력 방법이 다양합니다. (열거형으로 출력가능)
 * 		5. 무조건 동기화를 하기 때문에 단일 스레드 처리에서는
 * 			ArrayList나 LinkedList보다 성능이 떨어집니다.
 * 			참고) 동기화란 스레드에서 공유자원의 작업을 마치기 전 까지는
 * 					다른 스레드에서 공유자원에 접근 하지 못하게 약속하는 것
 */

public class Vector2_Generics {
	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();	// String 형만 올 수 있다.
		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
		
		String temp;
		for(int i=0; i<vec.size(); i++) {
			temp=vec.get(i);	// get(i)의 반환형이 Object형이지만 Generic에 String형으로 선언했기때문에
										//	(String)을 생략할수있다.  temp=(String)vec.get(i);
										// Generic을 사용하지 않을 경우에는 반환형을 명시적으로 선언해야 합니다.
			System.out.println(temp);
			System.out.println(temp.toUpperCase());	// 대문자로 출력하기			
		}
	}
}
