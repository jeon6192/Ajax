package ex10_9.geometry_common;

class Test {

	public static void main(String[] args) {
		String message="Java program creates many objects.";
		System.out.println("�� ���ڼ� : "+message.length());
		System.out.println("������ index ��ġã�� - charAt()");
		for(int i=0;i<message.length();i++) {
			char ch=message.charAt(i);
			if(ch==' ')	System.out.println("index : "+i);
		}
		System.out.println("������ index ��ġã�� - subString()");
		for(int i=0;i<message.length();i++) {
			String str=message.substring(i, i+1);
			if(str.equals(" "))	System.out.println("index : "+i);
		}
		
	}

}
