package ex8_20_Interface;

class PhoneMain {

	public static void main(String[] args) {
		PhoneA obj1=new PhoneA();
		PhoneB obj2=new PhoneB();
		PhoneC obj3=new PhoneC();
		printFunction(obj1);
		printFunction(obj2);
		printFunction(obj3);

	}
	static void printFunction(Phone obj) {
		System.out.println("====="+obj.name+"=====");
		obj.Call(obj.call);
		obj.Data(obj.data);
		obj.TvRemote(obj.remote+"\n");	
	}

}
