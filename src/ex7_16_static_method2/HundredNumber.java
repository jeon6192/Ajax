package ex7_16_static_method2;

public class HundredNumber {
	static int[] arr;
	
	public HundredNumber() {
		System.out.println("생성자 입니다");
	}

	static {
		System.out.println("클래스 초기화 블럭");
		arr=new int[100];
		for(int i=0;i<100;i++) {
			arr[i]=i;
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}