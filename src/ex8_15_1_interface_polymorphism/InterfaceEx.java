package ex8_15_1_interface_polymorphism;

class InterfaceEx {
	public static void main(String args[]) {
		Lendable[] arr=new Lendable[3];
		arr[0]=new SeparateVolume("883��", "Ǫ���� ����", "����");
		arr[1]=new SeparateVolume("609.2", "����̼���", "���긮ġ");
		arr[2]=new AppCDInfo("02-17", "XML�� ���� �ڹ� ���α׷���");
		
		for(int i=0;i<arr.length;i++) {
			checkOutAll(arr[i], "������", "20180201");
		}
		
	}
	static void checkOutAll(Lendable obj, String borrower, String date) {
		obj.checkOut(borrower, date);
	}

}
