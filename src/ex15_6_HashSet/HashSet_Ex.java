package ex15_6_HashSet;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/*
 * 	 Set �������̽�
 * 	   - HashSet (��ӹ޴� Ŭ����) : ���������� HashMap�� �̿��ؼ� ����������� HashSet�̶�
 *												�̸��� �ؽ��� �̿��ؼ� �����߱� ������ �ٿ��� ���Դϴ�.
 *	   - TreeSet�� ���� �˻� Ʈ��(binary search tree)��� �ڷᱸ���� ���·� �����͸�
 *		 �����ϴ� �÷��� Ŭ�����Դϴ�. (������ �˴ϴ�.)
 *	 1. �������� �ڷ���(�⺻�ڷ���, ������ ���)�� Data�� ��� ������ �� �ֽ��ϴ�.
 *	     ex) int, double, char, boolean, String etc
 *	 2. ���� ���� ��,��� �մϴ�.
 *	 3. �ߺ��� Data�� �������� �ʽ��ϴ�.
 * 		��) �ζ� ��ȣ6���� �ߺ��ؼ� �Է¹��� �ʽ��ϴ�.
 */

public class HashSet_Ex {
	public static void main(String[] args) {
		// HashSet Ŭ������ ��ü ����
		Set hs=new HashSet();
		// HashSet hs=new HashSer();
		
		// hs ��ü�� ������ ��ü ����
		// ��ĳ���� hs.add(new String("���ƿ�"));	// �Ű������� Object���̱� ������
		hs.add("���ƿ�");
		hs.add("��ſ� �Ϸ�");
		
		hs.add(new Date()); 		// Date d=new Date();	 hs.add(d);
		
		// hs ��ü�� �����ϰ� �ִ� ������ ��ü ���
		System.out.println("hs�� ���� : "+hs);
		
		// "��ſ� �Ϸ�" ������ ��ü�� hs��ü���� ����
		hs.remove("��ſ� �Ϸ�");
		System.out.println("hs�� ���� : "+hs);
		
		System.out.println("\"���ƿ�\"�� �ֳ���? "+hs.contains("���ƿ�"));
		
		
		
	}
}
