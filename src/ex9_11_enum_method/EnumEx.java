package ex9_11_enum_method;

class EnumEx {
	public static void main(String args[]) {
		/*Day days[]=Day.values();
		
		for(Day day : days) {
			System.out.println(day);
		}*/
		printDay("MONDAY");
		
	}
	static void printDay(String name) {
		Day day=Day.valueOf(name);
		System.out.println(day);
		System.out.println(day.ordinal());
	}
}
