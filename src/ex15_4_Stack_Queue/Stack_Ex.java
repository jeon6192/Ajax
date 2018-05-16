package ex15_4_Stack_Queue;

import java.util.Stack;

/*
 * 	스택(Stack) 클래스 : Vector 클래스의 자식 클래스입니다.
 * 		1. LIFO(Last Input First Output) 구조
 * 			마지막으로 입력된 자료가 가장 먼저 출력되는 구조
 * 		2. 여러가지 자료형의 Data를 모두 저장할 수 있다.
 */

public class Stack_Ex {
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		System.out.println("비었나요? "+s.empty()); // empty() - boolean형값 리턴
		
		// Stack에 값을 넣음
		s.push("좋아요");
		s.push("박보검");
		
		// Stack의 값을 출력
		System.out.println("비었나요? "+s.empty());
		System.out.println("맨 마지막 데이터 : "+s.peek());	// peek() - 값을 꺼내지 않고 확인만 함
		System.out.println("s.size() : "+s.size());
		
		// Stack의 값을 출력
		while(!s.empty()) {
			System.out.println("데이터 출력 : "+s.pop());
		}
		System.out.println("비었나요? "+s.empty());
	}
}
