package ex9_9_enum;

enum Season {
	SPRING("봄"), SUMMER("여름"), FALL("가을"), WINTER("겨울");	// Season형으로 저장됨
	final private String name;
	private Season(String name) {
		this.name=name;
		System.out.println("생성자 "+name+" 호출");
	}
	String value() {
		return name;
	}
}
