package ex15_5_HashMap_TreeMap;

import java.util.Map;
import java.util.TreeMap;

/*
 * 	TreeMap
 * 	  이진 검색 트리의 형태로 키와 값의 쌍으로 이루어진 데이터를 키로 정렬해서 저장합니다
 * 	  검색과 정렬에 적합한 클래스 입니다.
 */

public class TreeMap_Generics {
	public static void main(String[] args) {
				Map<String, String> hm=new TreeMap<String, String>();
				
				// Key와 Value 쌍을 삽입
				// Map의 메소드는 put을 이용해 (Key, Value) 쌍으로 자료를 저장합니다.
				hm.put("woman", "재미있니");
				hm.put("man", "좋은 하루");
				hm.put("age", new Integer(10).toString());
				hm.put("city", "seoul");
				
				// HashMap에 있는 객체들을 출력
				// 출력 방법 1. 해당 객체명으로 출력
				System.out.println(hm);
				
				// 출력 방법 2. Key 값만 출력
				System.out.println(hm.keySet());
				// Key값이 정렬되어 있네
				
				// 출력 방법 3. Value 값만 출력
				System.out.println(hm.values());
				
				// 출력 방법 4. get(Key) : Key에 해당하는 Value를 출력  -  가장 많이 사용
				System.out.println(hm.get("woman"));
				System.out.println(hm.get("city"));
	}
}
