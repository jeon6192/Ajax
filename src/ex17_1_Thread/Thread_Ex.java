package ex17_1_Thread;

public class Thread_Ex {
	public static void main(String[] args) {
		
		Thread t1=new DigitThread();
		t1.start();
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch);
		}
		System.out.println("\n������ �̸� : "+Thread.currentThread().getName());
		System.out.println(t1.getName());
		
	}
}
