package ex7_2_constructor;

public class SubscriberInfo {
	String name;
	String id;
	String password;
	String phoneNo;
	String address;
	public SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		this.name = name;
		this.id = id;
		this.password = password;
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
