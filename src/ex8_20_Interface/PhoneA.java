package ex8_20_Interface;

class PhoneA extends Phone{

	public PhoneA() {
		super("PhoneA","가능", "3G", "불가능");
	}
	
	public void Call(String call) {
		System.out.println("전화 송/수신 "+call+"합니다");				
	}

	public void Data(String data) {
		System.out.println(data+" 입니다.");				
	}

	public void TvRemote(String remote) {
		System.out.println("TV 리모컨 "+remote);
	}
	
	
}
