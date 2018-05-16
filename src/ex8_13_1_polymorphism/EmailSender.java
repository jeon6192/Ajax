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
		System.out.println("제목 : "+title);
		System.out.println("보내는 사람 : "+senderName);
		System.out.println("이메일 : "+recipient);
		System.out.println("회신 이메일 : "+senderAddr);
		System.out.println("이메일 내용 : "+emailBody);
	}

}