package ex8_17_interface_exception;

class InterfaceEx {
	public static void main(String args[]) {
		SeparateVolume obj=new SeparateVolume("863ㅂ774개", "개미", "베르베르");
		
		printState(obj);
		try {
			obj.checkOut("강묘연", "20180219");
			obj.checkOut("강묘연", "20180219");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		printState(obj);
		
	}
	
	static void printState(SeparateVolume obj) {
		if(obj.state==Lendable2.STATE_NORMAL) 	System.out.println("대출가능");
		if(obj.state==Lendable2.STATE_BORROWED) {
			System.out.println("대출중");
			System.out.println("대출인 : "+obj.borrower);
			System.out.println("대출일 : "+obj.checkOutDate);
		}
		
	}

}
