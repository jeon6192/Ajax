package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayList5_add_set_remove {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		// list에 3개의 데이터를 추가
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");	// [포도, 딸기, 복숭아]
		
		// list에 2개의 데이터를 삽입
		list.add(2, "키위");	// 인덱스 2 위치에 삽입	[포도, 딸기, 키위, 복숭아]
		list.add(4, "키위");	// 인덱스 4 위치에 삽입	[포도, 딸기, 키위, 복숭아, 키위]
		pArrayList(list);
		
		// index 0 위치에 데이터를 "오렌지"로 바꿉니다.
		list.set(0, "오렌지");		// 기존 index 0의 값과 교체	[오렌지, 딸기, 키위, 복숭아, 키위]
		pArrayList(list);
		
		// index 1 위치에 있는 데이터를 삭제합니다.
		list.remove(1);	// [오렌지, 키위, 복숭아, 키위]
		pArrayList(list);
		
		// list에서 "키위"라는 데이터를 찾아서 삭제합니다.
		list.remove("키위");
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