package ex7_5_default_constructor;

public class Subscriber {
	public static void main(String args[]) {
		SubscriberInfo obj=new SubscriberInfo();
		
		printSubscirberInfo(obj);
	}
	static void printSubscirberInfo(SubscriberInfo obj) {
		System.out.println("�̸� : "+obj.name);
		System.out.println("���̵� : "+obj.id);
		System.out.println("�н����� : "+obj.password);
		System.out.println("��ȭ��ȣ : "+obj.phoneNo);
		System.out.println("�ּ� : "+obj.address);
	}

}
