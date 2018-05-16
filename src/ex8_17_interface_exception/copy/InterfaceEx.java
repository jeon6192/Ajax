package ex8_17_interface_exception.copy;

class InterfaceEx {
	static State state;
	public static void main(String args[]) {
		SeparateVolume obj=new SeparateVolume("863��774��", "����", "��������");
		printState(obj);
		try {
			obj.checkOut("������", "20180219");
			obj.checkOut("������", "20180219");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			obj.checkIn("������", "20180219");
		}
		printState(obj);
		
	}
	
	static void printState(SeparateVolume obj) {
		if(obj.state==State.STATE_NORMAL) 	System.out.println(obj.state.getState());
		if(obj.state==State.STATE_BORROWED) {
			System.out.println(obj.state.getState());
			System.out.println("������ : "+obj.borrower);
			System.out.println("������ : "+obj.checkOutDate);
		}
		
	}

}
