package ex7_6_default_constructor2;

public class Subscriber {
	public static void main(String args[]) {
		SubscriberInfo obj=new SubscriberInfo("���ӽ� ����","java","java","010-111-2222","���� ã�� ������");
		
		printSubscirberInfo(obj);
		
		obj.setAddress("����� ������ ���ﵿ");
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
