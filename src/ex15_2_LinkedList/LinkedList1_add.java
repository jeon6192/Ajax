package ex15_2_LinkedList;

import java.util.LinkedList;

/*	
 * 	LinkedList�� ArrayList�� ������
 * 	- �������� �߰� �Ǵ� ������ ArrayList���� �ӵ��� �����ϴ�.
 *	  ArrayList�� ��� ���ʴ�� �����͸� �߰��ϰ�
 *	  �������������� �����͸� �����ϴ� ���� LinkedList���� �����ϴ�.
 *	  ������ �߰��� �����͸� �߰��Ϸ��� ���ڸ��� ����� ����
 *	  �ٸ� �����͸� �����ؼ� �̵��ؾ� �ϰ�
 *	  ������ ��쿡�� �����͸� ���ġ�ؾ� ������
 *	  LinkedList�� ��쿡�� �� ��Ұ� ���Ḹ �������ָ� �Ǳ� ������
 *	  ó���ӵ��� ����� �����ϴ�.
 *	- �˻����� ArrayList�� ���� ���������� �޸𸮻� �����ϱ� ������ ã�µ� ��������
 *	  �ҿ��������� ��ġ�� LinkedList�� ó������ ���ʴ�� ���󰡾�
 *	  ���ϴ� ���� ���� �� �־� �˻��ð��� �����ϴ�.
 *	 ��.. �����..
 */	

public class LinkedList1_add {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		
		int num=list.size();
		for(int cnt=0; cnt<num; cnt++) {
			String str=list.get(cnt);
			System.out.println(str);
		}
		
	}
}
