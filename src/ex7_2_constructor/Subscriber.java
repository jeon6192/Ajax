package ex7_2_constructor;

public class Subscriber {
	public static void main(String args[]) {
		SubscriberInfo obj1=new SubscriberInfo("�����", "poorman", "zebi");
		SubscriberInfo obj2=new SubscriberInfo("�����", "richman", "money", "02-123-4567", "����");
		
		printSubscirberInfo(obj1);
		printSubscirberInfo(obj2);
	}
	static void printSubscirberInfo(SubscriberInfo obj) {
		System.out.println("�̸� : "+obj.name);
		System.out.println("���̵� : "+obj.id);
		System.out.println("�н����� : "+obj.password);
		System.out.println("��ȭ��ȣ : "+obj.phoneNo);
		System.out.println("�ּ� : "+obj.address);
	}

}
