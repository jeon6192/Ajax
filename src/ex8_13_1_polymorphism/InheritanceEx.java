package ex8_13_1_polymorphism;

class InheritanceEx {
	public static void main(String args[]) {
		EmailSender obj1=new EmailSender("������ �����մϴ�", "������", "admin@dukeeshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		SMSSender obj2=new SMSSender("������ �����մϴ�", "������", "02-000-0000", "10% ���������� ����Ǿ����ϴ�.");
		MessageSender obj3=new SMSSender("tq", "tq", "tq", "tq");
		MessageSender obj4=new MessageSender("tq","tq") {
			
			@Override
			void sendMessage(String recipient) {
				// TODO Auto-generated method stub
				
			}
		};
		obj3=obj4;
		
		send(obj1, "hatman@yeyeye.com");
		send(obj1, "stickman@hahaha.com");
		send(obj2, "010-000-0000");
		send(obj3, "hq");
	}
	static void send(MessageSender obj, String recipient) {
		obj.sendMessage(recipient);
	}
}