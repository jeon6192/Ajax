package ex3_2_variable;

public class Variable {
	public static void main(String args[]) throws  NumberFormatException {
		// 정수형 변수
		byte b=10; // 1바이트 (작은 범위의 값을 저장하기에 유용하다)
		short s=100; // 2바이트
		int i=1000; // 4바이트
		
		long l=10000L; // 8바이트(l 또는 L을 숫자 뒤에 붙인다)
		b=20;
		System.out.println("b="+b);
		System.out.println("s="+s);
		System.out.println("i="+i+" l="+l);
		
		// 실수형 변수
		float ft=3.14f; // f나 F를 숫자 뒤에 붙인다
		double d=42.195d; // d나 D를 숫자 뒤에 붙이거나 생략할 수 있다
		System.out.println("ft="+ft+" d="+d);
		
		// 문자형 변수 - 하나의 문자를 나타낼 수 있는 자료형으로 16비트의 유니코드를 사용합니다
		char c1='A';
		char c2='@';
		char c3='홍';
		System.out.println("c1="+c1+" c2="+c2+" c3="+c3);
		
		System.out.printf("%d\n",(int)c1);
		System.out.printf("%d\n",(int)c2);
		System.out.printf("%d\n",(int)c3);
		System.out.println(c1+c2+c3);
		/*
		 컴퓨터가 숫자밖에 모르기 때문에 문자가 숫자로 변환되어 저장된다
		 'A' -> 65 - 문자를 코드로 변환하는 것을 문자 인코딩이라고 한다
		 65 -> 'A' - 코드를 문자로 변환하는 것을 문자 디코딩이라고 한다
		 
		 에러의 예
		 1. char cerror='AB';  두 글자 이상입력시 에러
		 2. char cerror_blank='';  반드시 하나의 문자가 필요
		 */
		
		// 문자형에 정수를 배정하면 정수에 해당하는 유니코드를 찾아서 변수에 넣는다
		char c4=65; // 영문 'A'를 의미
		char c5='\uAC01'; // 한글 유니코드 '가'를 의미
		System.out.println("c4="+c4+" c5="+c5);
		
		// 0으로 시작하면 8진수, 0x로 시작하면 16진수를 의미
		char c6=0101;
		char c7=0x41;
		System.out.println("8진수 0101="+c6+" 16진수 0x41="+c7);
		
		// 논리형 변수
		boolean b1=true;
		boolean b2=false;
		System.out.println("b1은 참인 "+b1);
		System.out.println("b2은 거짓인 "+b2);
	}
}
