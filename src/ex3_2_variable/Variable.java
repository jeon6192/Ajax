package ex3_2_variable;

public class Variable {
	public static void main(String args[]) throws  NumberFormatException {
		// ������ ����
		byte b=10; // 1����Ʈ (���� ������ ���� �����ϱ⿡ �����ϴ�)
		short s=100; // 2����Ʈ
		int i=1000; // 4����Ʈ
		
		long l=10000L; // 8����Ʈ(l �Ǵ� L�� ���� �ڿ� ���δ�)
		b=20;
		System.out.println("b="+b);
		System.out.println("s="+s);
		System.out.println("i="+i+" l="+l);
		
		// �Ǽ��� ����
		float ft=3.14f; // f�� F�� ���� �ڿ� ���δ�
		double d=42.195d; // d�� D�� ���� �ڿ� ���̰ų� ������ �� �ִ�
		System.out.println("ft="+ft+" d="+d);
		
		// ������ ���� - �ϳ��� ���ڸ� ��Ÿ�� �� �ִ� �ڷ������� 16��Ʈ�� �����ڵ带 ����մϴ�
		char c1='A';
		char c2='@';
		char c3='ȫ';
		System.out.println("c1="+c1+" c2="+c2+" c3="+c3);
		
		System.out.printf("%d\n",(int)c1);
		System.out.printf("%d\n",(int)c2);
		System.out.printf("%d\n",(int)c3);
		System.out.println(c1+c2+c3);
		/*
		 ��ǻ�Ͱ� ���ڹۿ� �𸣱� ������ ���ڰ� ���ڷ� ��ȯ�Ǿ� ����ȴ�
		 'A' -> 65 - ���ڸ� �ڵ�� ��ȯ�ϴ� ���� ���� ���ڵ��̶�� �Ѵ�
		 65 -> 'A' - �ڵ带 ���ڷ� ��ȯ�ϴ� ���� ���� ���ڵ��̶�� �Ѵ�
		 
		 ������ ��
		 1. char cerror='AB';  �� ���� �̻��Է½� ����
		 2. char cerror_blank='';  �ݵ�� �ϳ��� ���ڰ� �ʿ�
		 */
		
		// �������� ������ �����ϸ� ������ �ش��ϴ� �����ڵ带 ã�Ƽ� ������ �ִ´�
		char c4=65; // ���� 'A'�� �ǹ�
		char c5='\uAC01'; // �ѱ� �����ڵ� '��'�� �ǹ�
		System.out.println("c4="+c4+" c5="+c5);
		
		// 0���� �����ϸ� 8����, 0x�� �����ϸ� 16������ �ǹ�
		char c6=0101;
		char c7=0x41;
		System.out.println("8���� 0101="+c6+" 16���� 0x41="+c7);
		
		// ���� ����
		boolean b1=true;
		boolean b2=false;
		System.out.println("b1�� ���� "+b1);
		System.out.println("b2�� ������ "+b2);
	}
}
