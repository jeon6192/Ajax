package ex8_13_1_polymorphism;

abstract class MessageSender {
	String title;
	String senderName;
	public MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}
	abstract void sendMessage(String recipient);
	

}