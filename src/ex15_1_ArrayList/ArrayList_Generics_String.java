package ex15_1_ArrayList;

import java.util.ArrayList;

/*	- 지네릭스 (Generics) jdk 1.5에서 처음도입
 *	  다양한 타입의 객체들을 다루는 메소드나 컬렉션 클래스에 컴파일 시의 타입체크를 해주는 기능입니다.
 *	- 클래스옆에 꺽괴(<>) 기호를 이용해서 만듭니다. 
 *	- <>안에 특정 자료형(Wrapper 클래스, String, 사용자 정의 클래스형)을 넣어주면 됩니다.
 *	- 사용 예)
 *		List<String> list = new ArrayList<String>();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Double> list = new ArrayList<Double>();
		ArrayList<MemberInput> list = new ArrayList<MemberInput>();
 */

public class ArrayList_Generics_String {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		
		int num=list.size();	// list에 있는 데이터의 수를 구하는 메소드
		
		// list에 있는 데이터의 수만큼 반복하면서 데이터를 가져와서 출력
		for(int cnt=0;cnt<num;cnt++) {
			// get(index)메소드를 사용하여 index위치에 있는 자료를 가져옵니다.
			String str=list.get(cnt);
			// get(index)의 반환형이 Object지만 Generic( <String> )으로 선언했기 때문에 (String)을 생략할 수 있습니다.
			// temp=(String)vec.get(index);
			// Generic을 사용하지 않을 경우에는 반환형을 명시적으로 선언해야 합니다.
			System.out.println(str);
		}
		System.out.println("=== 향상된 for문 ===");
		for(String str : list) {
			System.out.println(str);
		}
		
		
	}
}
