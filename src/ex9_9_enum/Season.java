package ex9_9_enum;

enum Season {
	SPRING("��"), SUMMER("����"), FALL("����"), WINTER("�ܿ�");	// Season������ �����
	final private String name;
	private Season(String name) {
		this.name=name;
		System.out.println("������ "+name+" ȣ��");
	}
	String value() {
		return name;
	}
}
