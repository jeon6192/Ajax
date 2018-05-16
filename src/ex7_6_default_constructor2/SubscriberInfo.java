package ex7_6_default_constructor2;

public class SubscriberInfo {
	String name;
	String id;
	String password;
	String phoneNo;
	String address;
	public SubscriberInfo() {
		
	}
	public SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		this(name, id, password);
		this.phoneNo = phoneNo;
		this.address = address;
	}
	public SubscriberInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public void changePassword(String pwd) {
		this.password=pwd;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
