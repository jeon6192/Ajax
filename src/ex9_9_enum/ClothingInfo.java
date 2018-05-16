package ex9_9_enum;

class ClothingInfo {
	String code;
	String name;
	String material;
	Season season;
	
	static final int SPRING=1;
	static final int SUMMER=2;
	static final int FALL=3;
	static final int WINTER=4;
	public ClothingInfo(String code, String name, String material, Season season) {
		super();
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}
	
	

}
