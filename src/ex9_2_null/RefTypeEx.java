package ex9_2_null;

class RefTypeEx {
	public static void main(String args[]) {
		Point obj=null;
		
		try {
			System.out.println(obj.x);
			System.out.println(obj.y);
		}catch(NullPointerException e) {
			System.out.println("null ¿‘¥œ¥Ÿ.");
		}
		
	}

}
