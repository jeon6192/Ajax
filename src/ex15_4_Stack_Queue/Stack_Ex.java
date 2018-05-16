package ex15_4_Stack_Queue;

import java.util.Stack;

/*
 * 	����(Stack) Ŭ���� : Vector Ŭ������ �ڽ� Ŭ�����Դϴ�.
 * 		1. LIFO(Last Input First Output) ����
 * 			���������� �Էµ� �ڷᰡ ���� ���� ��µǴ� ����
 * 		2. �������� �ڷ����� Data�� ��� ������ �� �ִ�.
 */

public class Stack_Ex {
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		System.out.println("�������? "+s.empty()); // empty() - boolean���� ����
		
		// Stack�� ���� ����
		s.push("���ƿ�");
		s.push("�ں���");
		
		// Stack�� ���� ���
		System.out.println("�������? "+s.empty());
		System.out.println("�� ������ ������ : "+s.peek());	// peek() - ���� ������ �ʰ� Ȯ�θ� ��
		System.out.println("s.size() : "+s.size());
		
		// Stack�� ���� ���
		while(!s.empty()) {
			System.out.println("������ ��� : "+s.pop());
		}
		System.out.println("�������? "+s.empty());
	}
}
