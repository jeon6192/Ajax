package ex7_17_Singleton;

public class SingletonMain {
	public static void main(String args[]) {
		Singleton obj1=Singleton.getinstance();
		Singleton obj2=Singleton.getinstance();
		
		if(obj1==obj2) {
			System.out.println("���� Singleton ��ü �Դϴ�");
		}else {
			System.out.println("�ٸ� Singleton ��ü �Դϴ�");
		}
	}

}
