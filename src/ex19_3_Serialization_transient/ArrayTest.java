package ex19_3_Serialization_transient;

import java.util.ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("2");
		list.add("2");
		list.add("2");
		list.add("4");
		list.add("5");
		int num=list.size();
		for(int i=num-1;i>=0;i--) {
			if(list.get(i).equals("2")) {
				list.remove(i);
				System.out.println("»èÁ¦ ÈÄ "+list.size());
			}
			System.out.println(i);
		}
			
	}
}
