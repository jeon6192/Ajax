package ex17_13_notifyAll_wait;
/*
 * 	wait(), notify() notifyAll() �޼ҵ�� ����ȭ��Ͼȿ����� ��밡���ϴ�
 * 	�����尣 ������� �Ѱ���
 */
public class Sharedarea_Ex {
	public static void main(String[] args) {
		CalcThread th1=new CalcThread();
		PrintThread th2=new PrintThread();
		SimplePrintThread2 th3=new SimplePrintThread2();
		LuxuryPrintThread th4=new LuxuryPrintThread();
		
		// �������� ��ü�� �����ؼ� �� ��ü�� �������� �� �������� �ʵ忡 �����Ѵ�.
		SharedArea obj=new SharedArea();
		// CalcThread Ŭ������ PrintThread Ŭ�������� ����ϴ� sharedArea�� ����ȭ���ֱ�����
		// main Ŭ�������� sharedArea ��ü�� �����ؼ� ������ �������� �Ѱ���.
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
