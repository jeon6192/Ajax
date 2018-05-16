package ex7_5_default_constructor;

public class Subscriber {
	public static void main(String args[]) {
		SubscriberInfo obj=new SubscriberInfo();
		
		printSubscirberInfo(obj);
	}
	static void printSubscirberInfo(SubscriberInfo obj) {
		System.out.println("이름 : "+obj.name);
		System.out.println("아이디 : "+obj.id);
		System.out.println("패스워드 : "+obj.password);
		System.out.println("전화번호 : "+obj.phoneNo);
		System.out.println("주소 : "+obj.address);
	}

}
