package ex15_1_ArrayList;

import java.util.ArrayList;

/*
 * 	ArrayList�� �ִ� �����͸� �˻��ϴ� ��
 * 	- indexOf(data) : ���ڿ� ���� ���� ���� ù ��° �����͸� ã�Ƽ� �� ��ġ�� �ε����� ����
 *  - lastIndexOf(data) : ���ڿ� ���� ���� ���������� ������� �����͸� ã�ư��� �� ��ġ�� �ε����� ����
 *  - ���ڿ� ���� ���� ������ -1�� ����
 */

public class ArrayList_index {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("�ϳ�");
		list.add("�ϳ�");
		list.add("�ϳ�");
		list.add("�ϳ�");
		list.add("�ϳ�");
		
		int index1=list.indexOf("�ϳ�");
		int index2=list.lastIndexOf("�ϳ�");
		System.out.println(index1);
		System.out.println(index2);
	}
}
