package ex11_1_String;

class StringEx {

	public static void main(String[] args) {
		/*String str="자바 커피";
		int len=str.length();
		
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			System.out.println("index : "+i+" 문자열 : "+ch);
		}*/
		String str1="자바";
		String str2="자바";
		String str3=new String("자바");
		String str4=new String("자바");
		if(str1==str2)		System.out.println("str1==str2 같음");
		else		System.out.println("str1==str2 다름");
		
		if(str3==str4)		System.out.println("str3==str4 같음");
		else		System.out.println("str3==str4 다름");
		
		if(str1.equals(str2))		System.out.println("str1.equals(str2) 같음");
		else		System.out.println("str1.equals(str2) 다름");
		
		if(str3.equals(str4))		System.out.println("str3.equals(str4) 같음");
		else		System.out.println("str3.equals(str4) 다름");
	}

}
