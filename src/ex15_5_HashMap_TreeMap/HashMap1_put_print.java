package ex15_5_HashMap_TreeMap;

import java.util.HashMap;

public class HashMap1_put_print {
	public static void main(String[] args) {
		// HashMap ��ü ���� ��� �� ����
		// Map hm=new HashMap();	// ��� 1. ��ĳ����
		HashMap hm=new HashMap();	// ��� 2. ���� Ŭ������ ���� ��ü ����
		
		// Key�� Value ���� ����
		// Map�� �޼ҵ�� put�� �̿��� (Key, Value) ������ �ڷḦ �����մϴ�.
		hm.put("woman", "����ִ�");
		hm.put("man", "���� �Ϸ�");
		hm.put("age", new Integer(10));	// hm.put("age", 10);
		hm.put("city", "seoul");
		
		// HashMap�� �ִ� ��ü���� ���
		// ��� ��� 1. �ش� ��ü������ ���
		System.out.println(hm);
		
		// ��� ��� 2. Key ���� ���
		System.out.println(hm.keySet());
		
		// ��� ��� 3. Value ���� ���
		System.out.println(hm.values());
		
		// ��� ��� 4. get(Key) : Key�� �ش��ϴ� Value�� ���  -  ���� ���� ���
		System.out.println(hm.get("woman"));
		System.out.println(hm.get("city"));
		
	}
}
