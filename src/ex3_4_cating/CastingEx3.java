package ex3_4_cating;

public class CastingEx3 {
	public static void main(String args[]) {
		int i3=97;
		char c1=(char)i3;
		System.out.println("i3 �����ʹ� "+i3+" �Դϴ�.");
		System.out.println("c1 �����ʹ� "+c1+" �Դϴ�.");
		
		i3=65;
		c1=(char)i3;
		System.out.println("i3 �����ʹ� "+i3+" �Դϴ�.");
		System.out.println("c1 �����ʹ� "+c1+" �Դϴ�.");
		
		System.out.printf("%c\n",'A');
		System.out.printf("�����ڵ� 65�� ���� %c�� �ǹ��մϴ�.\n",'A');
		System.out.printf("���� A�� �����ڵ�� %d�Դϴ�.\n",(int)'A');
	}

}
