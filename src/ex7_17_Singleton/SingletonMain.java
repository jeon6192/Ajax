package ex7_17_Singleton;

public class SingletonMain {
	public static void main(String args[]) {
		Singleton obj1=Singleton.getinstance();
		Singleton obj2=Singleton.getinstance();
		
		if(obj1==obj2) {
			System.out.println("같은 Singleton 객체 입니다");
		}else {
			System.out.println("다른 Singleton 객체 입니다");
		}
	}

}
