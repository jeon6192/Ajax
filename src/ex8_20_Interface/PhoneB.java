package ex8_20_Interface;

class PhoneB extends Phone {
	
	public PhoneB() {
		super("PhoneB","가능", "4G", "불가능");
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
