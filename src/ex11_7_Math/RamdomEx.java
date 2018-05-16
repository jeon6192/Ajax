package ex11_7_Math;

import java.util.Random;

public class RamdomEx {
	public static void main(String[] args) {
		Random ran=new Random();
		System.out.println(ran.nextInt(100));	// 0~99
		System.out.println(ran.nextInt(100));
		System.out.println(ran.nextInt(100));
	}
}
