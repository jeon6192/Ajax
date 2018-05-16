package ex7_2_constructor;

public class Subscriber {
	public static void main(String args[]) {
		SubscriberInfo obj1=new SubscriberInfo("연흥부", "poorman", "zebi");
		SubscriberInfo obj2=new SubscriberInfo("연놀부", "richman", "money", "02-123-4567", "강남");
		
		printSubscirberInfo(obj1);
		printSubscirberInfo(obj2);
	}
	static void printSubscirberInfo(SubscriberInfo obj) {
		System.out.println("이름 : "+obj.name);
		System.out.println("아이디 : "+obj.id);
		System.out.println("패스워드 : "+obj.password);
		System.out.println("전화번호 : "+obj.phoneNo);
		System.out.println("주소 : "+obj.address);
	}

}
