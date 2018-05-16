package ex17_4_Runnable_Interface;

public class Multithread_Ex2 {
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			public void run() {
				for(char ch='a';ch<='z';ch++)
					System.out.print(ch);
			}
		});
		
		t1.start();
		/*char[] arr= {'��','��','��','��','��','��','��','��','��','��','��','��','��','��'};
		for(char ch:arr)
			System.out.print(ch);*/
	}
}
