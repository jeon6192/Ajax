package ex10_9.geometry_common;

class Test {

	public static void main(String[] args) {
		String message="Java program creates many objects.";
		System.out.println("총 글자수 : "+message.length());
		System.out.println("공백의 index 위치찾기 - charAt()");
		for(int i=0;i<message.length();i++) {
			char ch=message.charAt(i);
			if(ch==' ')	System.out.println("index : "+i);
		}
		System.out.println("공백의 index 위치찾기 - subString()");
		for(int i=0;i<message.length();i++) {
			String str=message.substring(i, i+1);
			if(str.equals(" "))	System.out.println("index : "+i);
		}
		
	}

}
