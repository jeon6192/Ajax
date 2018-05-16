package ex15_6_HashSet;

import java.util.Random;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		Random ran=new Random();
		TreeSet<Integer> hs=new TreeSet<Integer>();
		
		while(hs.size()<6) {
			int a=(ran.nextInt(45)+1);
			hs.add(a);
		}
		System.out.println(hs);
		
	}
}
