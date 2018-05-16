package ex15_5_HashMap_TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// ���� �Է¹޾Ƽ� max, min ���ϱ�
public class HashMap_MaxMin {
	public static void main(String[] args) {
		int[] data=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ��� ");
		for(int i=0; i<data.length; i++) {
			data[i]=sc.nextInt();
		}
		sc.close();
		
		Map<String, Integer> m=max_min(data);
		System.out.println("�ִ밪 : "+m.get("�ִ밪"));
		System.out.println("�ּҰ� : "+m.get("�ּҰ�"));
		
	}
	static Map<String, Integer> max_min(int[] a) {
		Map<String, Integer> hm=new HashMap<String, Integer>();
		int max=a[0];
		int min=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max)		max=a[i];
			else if(a[i]<min)		min=a[i];
		}
		hm.put("�ִ밪", max);
		hm.put("�ּҰ�", min);
		return hm;		
	}
}
