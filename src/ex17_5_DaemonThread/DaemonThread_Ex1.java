package ex17_5_DaemonThread;

/*
 *	���󾲷���� ���󾲷��尡�ƴ� �Ϲݾ������� �۾��� �������� 
 *	�Ϲݾ����尡 ����Ǹ� ���󾲷���� ���������� ����ȴ�.
 *	���󾲷����� ���δ� �������÷���, �������μ����� �ڵ�����, ȭ���ڵ����� ���� �ִ�.
 *	
 *	���󾲷���� ���ѷ����� ���ǹ��� �̿��ؼ� ���� �� ����ϰ� �ִٰ� Ư�������� �����Ǹ�
 *	�۾��� �����ϰ� �ٽ� ����ϵ��� �ۼ��մϴ�.
 *	������ ���� -> �ݵ�� setDaemon(true)�޼��� ȣ�� -> start() �޼��� ȣ��
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
		//System.out.println("�۾������� �ڵ�����Ǿ����ϴ�.");
		System.out.println("�ʹ� ����");
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
			System.out.println("����"+i);
			if(i==5)			Threadautosave.autoSave=true;
		}	// for
		System.out.println("���α׷��� �����մϴ�");
	}
}
