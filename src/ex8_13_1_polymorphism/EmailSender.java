package ex8_13_1_polymorphism;

class EmailSender extends MessageSender {
	String senderAddr;
	String emailBody;
	public EmailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}
	
	void sendMessage(String recipient) {
		System.out.println("--------------------------------");
		System.out.println("���� : "+title);
		System.out.println("������ ��� : "+senderName);
		System.out.println("�̸��� : "+recipient);
		System.out.println("ȸ�� �̸��� : "+senderAddr);
		System.out.println("�̸��� ���� : "+emailBody);
	}

}