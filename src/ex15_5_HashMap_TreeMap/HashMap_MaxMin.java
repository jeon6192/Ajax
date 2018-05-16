package ex15_5_HashMap_TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 숫자 입력받아서 max, min 구하기
public class HashMap_MaxMin {
	public static void main(String[] args) {
		int[] data=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요 ");
		for(int i=0; i<data.length; i++) {
			data[i]=sc.nextInt();
		}
		sc.close();
		
		Map<String, Integer> m=max_min(data);
		System.out.println("최대값 : "+m.get("최대값"));
		System.out.println("최소값 : "+m.get("최소값"));
		
	}
	static Map<String, Integer> max_min(int[] a) {
		Map<String, Integer> hm=new HashMap<String, Integer>();
		int max=a[0];
		int min=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max)		max=a[i];
			else if(a[i]<min)		min=a[i];
		}
		hm.put("최대값", max);
		hm.put("최소값", min);
		return hm;		
	}
}
