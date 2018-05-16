package ex3_4_cating;

public class CastingEx3 {
	public static void main(String args[]) {
		int i3=97;
		char c1=(char)i3;
		System.out.println("i3 데이터는 "+i3+" 입니다.");
		System.out.println("c1 데이터는 "+c1+" 입니다.");
		
		i3=65;
		c1=(char)i3;
		System.out.println("i3 데이터는 "+i3+" 입니다.");
		System.out.println("c1 데이터는 "+c1+" 입니다.");
		
		System.out.printf("%c\n",'A');
		System.out.printf("유니코드 65는 문자 %c를 의미합니다.\n",'A');
		System.out.printf("문자 A의 유니코드는 %d입니다.\n",(int)'A');
	}

}
