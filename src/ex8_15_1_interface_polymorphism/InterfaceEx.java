package ex8_15_1_interface_polymorphism;

class InterfaceEx {
	public static void main(String args[]) {
		Lendable[] arr=new Lendable[3];
		arr[0]=new SeparateVolume("883ㅇ", "푸코의 진자", "에코");
		arr[1]=new SeparateVolume("609.2", "서양미술사", "곰브리치");
		arr[2]=new AppCDInfo("02-17", "XML을 위한 자바 프로그래밍");
		
		for(int i=0;i<arr.length;i++) {
			checkOutAll(arr[i], "윤지혜", "20180201");
		}
		
	}
	static void checkOutAll(Lendable obj, String borrower, String date) {
		obj.checkOut(borrower, date);
	}

}
