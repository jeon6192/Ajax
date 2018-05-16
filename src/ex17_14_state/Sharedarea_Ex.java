package ex17_14_state;
/*
 * 	wait(), notify() notifyAll() �޼ҵ�� ����ȭ��Ͼȿ����� ��밡���ϴ�
 * 	�����尣 ������� �Ѱ���
 */
public class Sharedarea_Ex {
	public static void main(String[] args) {
		CalcThread th1=new CalcThread();
		th1.setName("���� ������");
		PrintThread th2=new PrintThread();
		th2.setName("��� ������");
		MonitorThread mth1=new MonitorThread(th1);
		MonitorThread mth2=new MonitorThread(th2);
		
		// �������� ��ü�� �����ؼ� �� ��ü�� �������� �� �������� �ʵ忡 �����Ѵ�.
		SharedArea obj=new SharedArea();
		// CalcThread Ŭ������ PrintThread Ŭ�������� ����ϴ� sharedArea�� ����ȭ���ֱ�����
		// main Ŭ�������� sharedArea ��ü�� �����ؼ� ������ �������� �Ѱ���.
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
