package ex15_3_Vector;

import java.util.Vector;

/*
 * 	Vector Ŭ���� - ArrayList�� ������, List�� ���� ���, �� �߿� List�� �� ���� ���
 * 		1. �������� �ڷ����� Data�� ��� ������ �� �ֽ��ϴ�.
 * 			ex) int, double, char, boolean, String etc
 * 		2. �����ִ� ��,��� ó��(index��ȣ ������ �����)
 * 		3. �ߺ��� Data�� ���� �� �� �ֽ��ϴ�.
 * 		4. ����� ����� �پ��մϴ�. (���������� ��°���)
 * 		5. ������ ����ȭ�� �ϱ� ������ ���� ������ ó��������
 * 			ArrayList�� LinkedList���� ������ �������ϴ�.
 * 			����) ����ȭ�� �����忡�� �����ڿ��� �۾��� ��ġ�� �� ������
 * 					�ٸ� �����忡�� �����ڿ��� ���� ���� ���ϰ� ����ϴ� ��
 */

public class Vector2_Generics {
	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();	// String ���� �� �� �ִ�.
		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
		
		String temp;
		for(int i=0; i<vec.size(); i++) {
			temp=vec.get(i);	// get(i)�� ��ȯ���� Object�������� Generic�� String������ �����߱⶧����
										//	(String)�� �����Ҽ��ִ�.  temp=(String)vec.get(i);
										// Generic�� ������� ���� ��쿡�� ��ȯ���� ��������� �����ؾ� �մϴ�.
			System.out.println(temp);
			System.out.println(temp.toUpperCase());	// �빮�ڷ� ����ϱ�			
		}
	}
}
