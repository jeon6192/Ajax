package ex15_4_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 *		ť(Queue) �������̽�
 *		- LinkedList (Queue �������̽��� ������ Ŭ����)�� ���
 *		- FIFO(First Input First Output) ����
 *		  ���� �Էµ� �ڷᰡ ���� ��µǴ� ���� 
 */

public class Queue_Ex {
	public static void main(String[] args) {
		// ť�� ����� LinkedList��ü�� �����մϴ�.
		// LinkedList<String> queue=new LinkedList<String>();
		Queue<String> queue=new LinkedList<String>();
		System.out.println("�������? "+queue.isEmpty());	// boolean�� �� ��ȯ
		
		// offer() �޼ҵ� : ť�� �����͸� �߰�
		queue.offer("�䳢");
		queue.offer("�罿");
		queue.offer("ȣ����");
		
		// peek() �޼ҵ� : ó�� �����͸� �״�� �л��·� �����ɴϴ�.
		System.out.println(queue.peek());	// �����͸� ������ �ʰ� Ȯ�θ� ��
		System.out.println("�������? "+queue.isEmpty());
		System.out.println("���� : "+queue.size());
		
		System.out.println("poll() ���");
		while(!queue.isEmpty()) {
			// poll() �޼ҵ�� ť�� �ִ� �����͸� �����ϸ鼭 �����ɴϴ�.
			System.out.println("������ ��� : "+queue.poll());
		}
		System.out.println("�������? "+queue.isEmpty());
		
	}
}
