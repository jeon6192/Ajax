package ex4_12_conditional_op;

public class ConditionalOpExample3_1 {
	public static void main(String args[]) {
		char c='C';
		int num;
		
		num=(c>64&&c<91)?c+32:c;
		System.out.print(c+"=>");
		System.out.printf("%c",num);
		
		char a='@';
		char lower=('A'<=a&&a<='Z')?(char)(a+32):a;
		System.out.println("\n"+lower);
	}
}