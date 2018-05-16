package ex8_11_abstract_ex;

class InheritanceEx {
	public static void main(String args[]) {
		Store1 obj1=new Store1();
		Store2 obj2=new Store2();
		Store3 obj3=new Store3();
		printPrice(obj1);
		printPrice(obj2);
		printPrice(obj3);
	}	
	static void printPrice(HeadQuarterStore obj) {
		System.out.println("--------------------");
		obj.orderKimchijjige();
		obj.orderBudaejjige();
		obj.orderBiBibap();
		obj.orderSunDaeguk();
		obj.orderGongGibap();
	}

}