package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayList_method {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>(10);
		list1.add("��");
		list1.add("����");		
		ArrayList<String> list2=new ArrayList<String>(10);
		list2.add("��");
		list2.add("����");
		list2.add("�ܿ�");
		
		// ������ list2 - list1
		list2.removeAll(list1);
		System.out.println(list1);
		System.out.println(list2);
		
		
		ArrayList<String> list3=new ArrayList<String>(10);
		list3.add("��");
		list3.add("����");
		ArrayList<String> list4=new ArrayList<String>(10);
		list4.add("��");
		list4.add("����");
		list4.add("�ܿ�");
		
		list4.addAll(list3);
		System.out.println(list3);
		System.out.println(list4);
		
		
		if(list1.contains("��")) {
			System.out.println("���� �����մϴ�.");
		}else {
			System.out.println("���� �������� �ʽ��ϴ�.");
		}
		
		
	}
}
