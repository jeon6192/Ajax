package ex11_1_String;

public class StringEx2 {

	public static void main(String[] args) {
		String str="���� ����ϴ� �ڹ�";
		for(int cnt=0;cnt<str.length();cnt++) {
			char ch=str.charAt(cnt);
			System.out.println("index : "+cnt+" ���ڿ� : "+ch);
		}
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 6));
	}

}
