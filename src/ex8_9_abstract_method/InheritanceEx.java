package ex8_9_abstract_method;

class InheritanceEx {
	public static void main(String args[]) {
		EmailSender obj1=new EmailSender("������ �����մϴ�", "������", "admin@dukeeshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		SMSSender obj2=new SMSSender("������ �����մϴ�", "������", "02-000-0000", "10% ���������� ����Ǿ����ϴ�.");
		
		obj1.sendMessage("hatman@yeyeye.com");
		obj1.sendMessage("stickman@hahaha.com");
		obj2.sendMessage("010-000-0000");
	}

}
