package ex11_2_StringBuffer_StringBuilder;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("���ع��� ��λ��� ������  ");
		System.out.println(sb.append("�⵵�� �����ϻ� "));
		System.out.println(sb.insert(19, "�ϴ����� �ϴ����� "));
		System.out.println(sb.delete(24, 28));
		System.out.println(sb.deleteCharAt(9));
		System.out.println(sb.delete(0, 5).append("�⵵�� �����ϻ� "));

	}

}
