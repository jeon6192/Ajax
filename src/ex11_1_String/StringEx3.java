package ex11_1_String;

class StringEx3 {

	public static void main(String[] args) {
		String str1="123456-4123456";
		
		printgender(str1);
		
	}
	static void printgender(String str) {
		String a=str.substring(7, 8);
		if(a.equals("1")||a.equals("3")) {
			System.out.println("남자");
		}else if(a.equals("2")||a.equals("4")) {
			System.out.println("여자");
		}else	System.out.println("외국인");
	}

}
