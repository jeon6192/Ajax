package ex8_14_2_interface;

class InterfaceEx {
	public static void main(String args[]) {
		SeparateVolume obj1=new SeparateVolume("863ㅂ774개", "개미", "베르베르");
		
		obj1.checkOut("수지", "2018-02-01");
		obj1.checkIn();
		
		AppCDInfo obj2=new AppCDInfo("2005-7001", "Redhat Fedora");
		obj2.checkOut("박보검", "2018-02-01");
		obj2.checkIn();
	}

}
