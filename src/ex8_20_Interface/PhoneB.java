package ex8_20_Interface;

class PhoneB extends Phone {
	
	public PhoneB() {
		super("PhoneB","����", "4G", "�Ұ���");
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
