package ex10_9.geometry_common;

class StringEx5 {

	public static void main(String[] args) {
		String message="niodfoasdcASJDbsmcmiOSC";
		int index1=message.indexOf('a');
		System.out.println("a�� ��ġ�� "+index1);
		int index2=message.indexOf(97);
		System.out.println("a�� ��ġ�� "+index2);
		int index3=message.indexOf(65);
		System.out.println("A�� ��ġ�� "+index3);
		int index4=message.lastIndexOf('S');
		System.out.println("message.lastIndexOf('a') : "+index4);

	}

}
