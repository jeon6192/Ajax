package ex8_16_interface_constant;

class InterfaceEx {
	public static void main(String args[]) {
		SeparateVolume obj=new SeparateVolume("863��774��", "����", "��������");
		
		printState(obj);
		
	}
	
	static void printState(SeparateVolume obj) {
		if(obj.state==Lendable.STATE_NORMAL) 	System.out.println("���Ⱑ��");
		if(obj.state==Lendable.STATE_BORROWED) {
			System.out.println("������");
			System.out.println("������ : "+obj.borrower);
			System.out.println("������ : "+obj.checkOutDate);
		}
		
	}

}
