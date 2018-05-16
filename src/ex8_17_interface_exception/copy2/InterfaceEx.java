package ex8_17_interface_exception.copy2;

import ex8_17_interface_exception.copy2.Lendable2.State;

class InterfaceEx {
	public static void main(String args[]) {
		SeparateVolume obj=new SeparateVolume("863��774��", "����", "��������");
		SeparateVolume obj2=new SeparateVolume("863��774��", "����", "��������");
		
		printState(obj);
		try {
			obj.checkOut("������", "20180219");
			obj2.checkOut("������", "20180219");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		printState(obj);
		
	}
	
	static void printState(SeparateVolume obj) {
		if(obj.state==Lendable2.State.STATE_NORMAL) 	System.out.println(State.STATE_NORMAL.getState());
		if(obj.state==Lendable2.State.STATE_BORROWED) {
			System.out.println(State.STATE_BORROWED.getState());
			System.out.println("������ : "+obj.borrower);
			System.out.println("������ : "+obj.checkOutDate);
		}
		
	}

}
