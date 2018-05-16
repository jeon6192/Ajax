package ex15_2_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2_set_remove {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		list.add(2, "Ű��");
		pLinkedList(list);
		
		list.set(0, "������");
		pLinkedList(list);
		
		list.remove(1);
		list.remove("Ű��");
		pLinkedList(list);
	}
	static void pLinkedList(LinkedList<String> list) {
		System.out.println("============");
		// iterator() �޼ҵ带 ȣ���Ͽ� Iterator ��ü�� ����ϴ�.
		Iterator<String> iterator=list.iterator();
		
		// Iterator ��ü�� �̿��Ͽ� list�� �ִ� �����͸� ������� �����ͼ� ���
		while(iterator.hasNext()) { // ���� ��ġ���� ���������Ͱ� �ִ��� Ȯ���ϴ� ����
			String str=iterator.next();	// ���� �����͸� �������� �޼ҵ�
			System.out.println(str);
		}
	}
	
}
