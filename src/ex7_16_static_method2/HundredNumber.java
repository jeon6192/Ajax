package ex7_16_static_method2;

public class HundredNumber {
	static int[] arr;
	
	public HundredNumber() {
		System.out.println("������ �Դϴ�");
	}

	static {
		System.out.println("Ŭ���� �ʱ�ȭ ��");
		arr=new int[100];
		for(int i=0;i<100;i++) {
			arr[i]=i;
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}