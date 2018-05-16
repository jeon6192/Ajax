package ex7_17_Singleton;

public class Singleton {
	private Singleton() {
		
	}
	private static Singleton obj=new Singleton();
	
	public static Singleton getinstance() {
		return obj;
	}

}