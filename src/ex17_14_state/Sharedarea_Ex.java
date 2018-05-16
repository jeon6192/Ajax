package ex17_14_state;
/*
 * 	wait(), notify() notifyAll() 메소드는 동기화블록안에서만 사용가능하다
 * 	스레드간 제어권을 넘겨줌
 */
public class Sharedarea_Ex {
	public static void main(String[] args) {
		CalcThread th1=new CalcThread();
		th1.setName("계산기 쓰레드");
		PrintThread th2=new PrintThread();
		th2.setName("출력 쓰레드");
		MonitorThread mth1=new MonitorThread(th1);
		MonitorThread mth2=new MonitorThread(th2);
		
		// 공유영역 객체를 생성해서 그 객체의 참조값을 두 스레드의 필드에 저장한다.
		SharedArea obj=new SharedArea();
		// CalcThread 클래스와 PrintThread 클래스에서 사용하는 sharedArea를 동기화해주기위해
		// main 클래스에서 sharedArea 객체를 생성해서 동일한 참조값을 넘겨줌.
		th1.sharedArea=obj;
		th2.sharedArea=obj;
		th1.start();
		th2.start();
		mth1.start();
		try {
			Thread.sleep(100);
		}catch(Exception e) {}
		mth2.start();
	}
}
