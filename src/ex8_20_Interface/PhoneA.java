package ex8_20_Interface;

class PhoneA extends Phone{

	public PhoneA() {
		super("PhoneA","����", "3G", "�Ұ���");
	}
	
	public void Call(String call) {
		System.out.println("��ȭ ��/���� "+call+"�մϴ�");				
	}

	public void Data(String data) {
		System.out.println(data+" �Դϴ�.");				
	}

	public void TvRemote(String remote) {
		System.out.println("TV ������ "+remote);
	}
	
	
}
