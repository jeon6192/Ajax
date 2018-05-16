package ex15_5_HashMap_TreeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap3_Generics {
	public static void main(String[] args) {
		// HashMap 객체 생성 방법 두 가지
				// Map hm=new HashMap();	// 방법 1. 업캐스팅
				HashMap<String, String> hm=new HashMap<String, String>();	// 방법 2. 구현 클래스를 통한 객체 생성
				MemberInfo obj=new MemberInfo("abc", 10, "em", "add");
				HashMap<String,MemberInfo> hm2=new HashMap<String,MemberInfo>();
				hm2.put("haha",obj);
				hm2.put("haha2",obj);
				hm2.put("haha3",obj);
				
				System.out.println(hm2);
				
				// Key와 Value 쌍을 삽입
				// Map의 메소드는 put을 이용해 (Key, Value) 쌍으로 자료를 저장합니다.
				hm.put("woman", "재미있니");
				hm.put("man", "좋은 하루");
				hm.put("age", new String("10"));
				hm.put("city", "seoul");
				
				// HashMap에 있는 객체들을 출력
				// 출력 방법 1. 해당 객체명으로 출력
				System.out.println(hm);
				
				// 출력 방법 2. Key 값만 출력
				System.out.println(hm.keySet());
				
				// 출력 방법 3. Value 값만 출력
				System.out.println(hm.values());
				
				// 출력 방법 4. get(Key) : Key에 해당하는 Value를 출력  -  가장 많이 사용
				System.out.println(hm.get("woman"));
				System.out.println(hm.get("city"));
				
				System.out.println("=====");
				// 출력 방법 5
				Set<String> keys=hm2.keySet();	// Set에 woman, man ... Key값을 넣어줌
				for(String key:keys) {
					System.out.println(key+"="+hm2.get(key));
				}
	}
}
