package ex15_6_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Ex2 {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		// ������ ����
		set.add("�ڹ�");
		set.add("īǪġ��");
		set.add("����������");
		set.add("�ڹ�");
		System.out.println("����� �������� �� : "+set.size());		// �ߺ��� "�ڹ�"�� �ȵ� �����ѤѤ�
		
		// set ��ü�� �����ϰ� �ִ� ������ ��ü ���
		System.out.println(set);
		
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String str=iterator.next();
			System.out.println(str);
		}
	}
}
