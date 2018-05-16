package ex15_5_HashMap_TreeMap;

import java.util.Map;
import java.util.TreeMap;

/*
 * 	TreeMap
 * 	  ���� �˻� Ʈ���� ���·� Ű�� ���� ������ �̷���� �����͸� Ű�� �����ؼ� �����մϴ�
 * 	  �˻��� ���Ŀ� ������ Ŭ���� �Դϴ�.
 */

public class TreeMap_Generics {
	public static void main(String[] args) {
				Map<String, String> hm=new TreeMap<String, String>();
				
				// Key�� Value ���� ����
				// Map�� �޼ҵ�� put�� �̿��� (Key, Value) ������ �ڷḦ �����մϴ�.
				hm.put("woman", "����ִ�");
				hm.put("man", "���� �Ϸ�");
				hm.put("age", new Integer(10).toString());
				hm.put("city", "seoul");
				
				// HashMap�� �ִ� ��ü���� ���
				// ��� ��� 1. �ش� ��ü������ ���
				System.out.println(hm);
				
				// ��� ��� 2. Key ���� ���
				System.out.println(hm.keySet());
				// Key���� ���ĵǾ� �ֳ�
				
				// ��� ��� 3. Value ���� ���
				System.out.println(hm.values());
				
				// ��� ��� 4. get(Key) : Key�� �ش��ϴ� Value�� ���  -  ���� ���� ���
				System.out.println(hm.get("woman"));
				System.out.println(hm.get("city"));
	}
}
