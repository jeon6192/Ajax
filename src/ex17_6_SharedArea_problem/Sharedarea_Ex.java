package ex17_6_SharedArea_problem;

public class Sharedarea_Ex {
	public static void main(String[] args) {
		CalcThread th1=new CalcThread();
		PrintThread th2=new PrintThread();
		
		// 공유영역 객체를 생성해서 그 객체의 참조값을 두 스레드의 필드에 저장한다.
		SharedArea obj=new SharedArea();
		th1.sharedArea=obj;
		th2.sharedArea=obj;
		th1.start();
		th2.start();
	}
}
