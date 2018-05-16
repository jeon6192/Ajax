package ex6_3_method_intro;

public class MethodEx1_1_1 {
	public static void main(String args[]) {
		MethodEx1_1_1.printCharacter('*', 30);
		printCharacter('-', 30);
		System.out.println("Hello, Java");
		printCharacter('-', 30);
		printCharacter('*', 30);
		
		
	}
	
	// 메서드 정의
	public static void printCharacter(char ch, int num) {
		for(int i=0;i<num;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	

}
