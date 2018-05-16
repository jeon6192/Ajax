package ex5_7_continue;

public class Test {
	public static void main(String args[]) {
		/*int i,j,k;
		for(i=1;i<6;i++) {			
			for(j=5;j>i-1;j--) {
				System.out.print(" ");
			}
			for(k=1;k<i*2;k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		int i,j,k;
		for(i=1;i<6;i++) {			
			for(j=5;j>i-1;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
