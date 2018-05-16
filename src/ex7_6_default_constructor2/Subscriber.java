package ex7_6_default_constructor2;

public class Subscriber {
	public static void main(String args[]) {
		SubscriberInfo obj=new SubscriberInfo("제임스 고슬링","java","java","010-111-2222","나를 찾지 마세요");
		
		printSubscirberInfo(obj);
		
		obj.setAddress("서울시 강남구 역삼동");
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
