package ex8_17_interface_exception;

class InterfaceEx {
	public static void main(String args[]) {
		SeparateVolume obj=new SeparateVolume("863��774��", "����", "��������");
		
		printState(obj);
		try {
			obj.checkOut("������", "20180219");
			obj.checkOut("������", "20180219");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		printState(obj);
		
	}
	
	static void printState(SeparateVolume obj) {
		if(obj.state==Lendable2.STATE_NORMAL) 	System.out.println("���Ⱑ��");
		if(obj.state==Lendable2.STATE_BORROWED) {
			System.out.println("������");
			System.out.println("������ : "+obj.borrower);
			System.out.println("������ : "+obj.checkOutDate);
		}
		
	}

}
