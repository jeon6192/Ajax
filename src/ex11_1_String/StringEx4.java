package ex11_1_String;

class StringEx4 {

	public static void main(String[] args) {
		String str1="    Let it be.     ";
		String str2=str1.trim();
		System.out.println("==trim()==");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("--concat()--");
		System.out.println(str2.concat(" Speaking words of wisdom."));
		System.out.println(str2);
		System.out.println("==toUpperCase()==");
		System.out.println(str2.toUpperCase());
		System.out.println(str2);
		System.out.println("==toLowerCase()==");
		System.out.println(str2.toLowerCase());
		System.out.println(str2);
		System.out.println("==replace()==");
		System.out.println(str2.replace('e', 'a'));
		System.out.println(str2);
		System.out.println("==toString()==");
		System.out.println(str1.toString());
		System.out.println(str2.toString());

	}

}
