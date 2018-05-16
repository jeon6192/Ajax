package ex8_20_Interface;

class Phone implements PhoneFunction{
	String name,call, data, remote;

	
	public Phone(String name, String call, String data, String remote) {
		super();
		this.name=name;
		this.call = call;
		this.data = data;
		this.remote = remote;
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
