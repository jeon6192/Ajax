package ex15_5_HashMap_TreeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap3_Generics {
	public static void main(String[] args) {
		// HashMap ��ü ���� ��� �� ����
				// Map hm=new HashMap();	// ��� 1. ��ĳ����
				HashMap<String, String> hm=new HashMap<String, String>();	// ��� 2. ���� Ŭ������ ���� ��ü ����
				MemberInfo obj=new MemberInfo("abc", 10, "em", "add");
				HashMap<String,MemberInfo> hm2=new HashMap<String,MemberInfo>();
				hm2.put("haha",obj);
				hm2.put("haha2",obj);
				hm2.put("haha3",obj);
				
				System.out.println(hm2);
				
				// Key�� Value ���� ����
				// Map�� �޼ҵ�� put�� �̿��� (Key, Value) ������ �ڷḦ �����մϴ�.
				hm.put("woman", "����ִ�");
				hm.put("man", "���� �Ϸ�");
				hm.put("age", new String("10"));
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
				
				System.out.println("=====");
				// ��� ��� 5
				Set<String> keys=hm2.keySet();	// Set�� woman, man ... Key���� �־���
				for(String key:keys) {
					System.out.println(key+"="+hm2.get(key));
				}
	}
}
