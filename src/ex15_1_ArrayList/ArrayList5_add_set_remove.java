package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayList5_add_set_remove {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		// list�� 3���� �����͸� �߰�
		list.add("����");
		list.add("����");
		list.add("������");	// [����, ����, ������]
		
		// list�� 2���� �����͸� ����
		list.add(2, "Ű��");	// �ε��� 2 ��ġ�� ����	[����, ����, Ű��, ������]
		list.add(4, "Ű��");	// �ε��� 4 ��ġ�� ����	[����, ����, Ű��, ������, Ű��]
		pArrayList(list);
		
		// index 0 ��ġ�� �����͸� "������"�� �ٲߴϴ�.
		list.set(0, "������");		// ���� index 0�� ���� ��ü	[������, ����, Ű��, ������, Ű��]
		pArrayList(list);
		
		// index 1 ��ġ�� �ִ� �����͸� �����մϴ�.
		list.remove(1);	// [������, Ű��, ������, Ű��]
		pArrayList(list);
		
		// list���� "Ű��"��� �����͸� ã�Ƽ� �����մϴ�.
		list.remove("Ű��");
		pArrayList(list);
	}
	static void pArrayList(ArrayList<String> list) {
		System.out.println("===========");
		int num=list.size();
		for(int cnt=0; cnt<num; cnt++) {
			String str=list.get(cnt);
			System.out.println("["+cnt+"] = "+str);
		}
	}

}