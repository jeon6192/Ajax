package ex11_1_String;

class StringEx {

	public static void main(String[] args) {
		/*String str="�ڹ� Ŀ��";
		int len=str.length();
		
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			System.out.println("index : "+i+" ���ڿ� : "+ch);
		}*/
		String str1="�ڹ�";
		String str2="�ڹ�";
		String str3=new String("�ڹ�");
		String str4=new String("�ڹ�");
		if(str1==str2)		System.out.println("str1==str2 ����");
		else		System.out.println("str1==str2 �ٸ�");
		
		if(str3==str4)		System.out.println("str3==str4 ����");
		else		System.out.println("str3==str4 �ٸ�");
		
		if(str1.equals(str2))		System.out.println("str1.equals(str2) ����");
		else		System.out.println("str1.equals(str2) �ٸ�");
		
		if(str3.equals(str4))		System.out.println("str3.equals(str4) ����");
		else		System.out.println("str3.equals(str4) �ٸ�");
	}

}
