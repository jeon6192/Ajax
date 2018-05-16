package ex17_5_DaemonThread;

/*
 *	데몬쓰레드는 데몬쓰레드가아닌 일반쓰레드의 작업에 도움을줌 
 *	일반쓰레드가 종료되면 데몬쓰레드는 강제적으로 종료된다.
 *	데몬쓰레드의 예로는 가비지컬렉터, 워드프로세서의 자동저장, 화면자동갱신 등이 있다.
 *	
 *	데몬쓰레드는 무한루프와 조건문을 이요해서 실행 후 대기하고 있다가 특정조건이 만족되면
 *	작업을 수행하고 다시 대기하도록 작성합니다.
 *	쓰레드 생성 -> 반드시 setDaemon(true)메서드 호출 -> start() 메서드 호출
 */

class Threadautosave implements Runnable{
	static boolean autoSave=false;
	public void run() {
		while(true) {
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {}
			if(autoSave) {
				autoSave();
			}
		} // while
	}	// run
	public void autoSave() {
		//System.out.println("작업파일이 자동저장되었습니다.");
		System.out.println("너무 졸려");
	}
}

public class DaemonThread_Ex1 {
	public static void main(String[] args) {
		Thread t=new Thread(new Threadautosave());
		t.setDaemon(true);	// Set DaemonThread 
		
		t.start();
		
		for(int i=1;i<=30;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {}
			System.out.println("졸려"+i);
			if(i==5)			Threadautosave.autoSave=true;
		}	// for
		System.out.println("프로그램을 종료합니다");
	}
}
