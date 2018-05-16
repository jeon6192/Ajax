package ex17_4_Runnable_Interface;

public class Multithread_Ex1 {
	public static void main(String[] args) {
		Thread t1=new Thread(new SmallLetters());
		t1.start();
		/*char[] arr= {'��','��','��','��','��','��','��','��','��','��','��','��','��','��'};
		for(char ch:arr)
			System.out.print(ch);*/
	}
}
