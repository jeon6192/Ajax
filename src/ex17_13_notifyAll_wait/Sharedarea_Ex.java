package ex17_13_notifyAll_wait;
/*
 * 	wait(), notify() notifyAll() 메소드는 동기화블록안에서만 사용가능하다
 * 	스레드간 제어권을 넘겨줌
 */
public class Sharedarea_Ex {
	public static void main(String[] args) {
		CalcThread th1=new CalcThread();
		PrintThread th2=new PrintThread();
		SimplePrintThread2 th3=new SimplePrintThread2();
		LuxuryPrintThread th4=new LuxuryPrintThread();
		
		// 공유영역 객체를 생성해서 그 객체의 참조값을 두 스레드의 필드에 저장한다.
		SharedArea obj=new SharedArea();
		// CalcThread 클래스와 PrintThread 클래스에서 사용하는 sharedArea를 동기화해주기위해
		// main 클래스에서 sharedArea 객체를 생성해서 동일한 참조값을 넘겨줌.
		th1.sharedArea=obj;
		th2.sharedArea=obj;
		th3.sharedArea=obj;
		th4.sharedArea=obj;
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}
