package ex8_9_abstract_method;

abstract class MessageSender {
	String title;
	String senderName;
	public MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}
	abstract void sendMessage(String recipient);
	

}
