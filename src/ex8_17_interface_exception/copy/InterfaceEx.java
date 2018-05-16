package ex8_17_interface_exception.copy;

class InterfaceEx {
	static State state;
	public static void main(String args[]) {
		SeparateVolume obj=new SeparateVolume("863ㅂ774개", "개미", "베르베르");
		printState(obj);
		try {
			obj.checkOut("강묘연", "20180219");
			obj.checkOut("강묘연", "20180219");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			obj.checkIn("강묘연", "20180219");
		}
		printState(obj);
		
	}
	
	static void printState(SeparateVolume obj) {
		if(obj.state==State.STATE_NORMAL) 	System.out.println(obj.state.getState());
		if(obj.state==State.STATE_BORROWED) {
			System.out.println(obj.state.getState());
			System.out.println("대출인 : "+obj.borrower);
			System.out.println("대출일 : "+obj.checkOutDate);
		}
		
	}

}
