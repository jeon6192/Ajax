package ex17_6_SharedArea_problem;

public class Sharedarea_Ex {
	public static void main(String[] args) {
		CalcThread th1=new CalcThread();
		PrintThread th2=new PrintThread();
		
		// �������� ��ü�� �����ؼ� �� ��ü�� �������� �� �������� �ʵ忡 �����Ѵ�.
		SharedArea obj=new SharedArea();
		th1.sharedArea=obj;
		th2.sharedArea=obj;
		th1.start();
		th2.start();
	}
}
