package ex8_20_Interface;

class PhoneC extends Phone{
	public PhoneC() {
		super("PhoneC","����", "4G", "����");
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
