package ex13_3_Object_toString_override;

public class ObjectEx1 {
	public static void main(String[] args) {
		GoodsStock obj=new GoodsStock("57293", 100);
		String str=obj.toString();
		System.out.println(str);
		String str2="재고 정보 : "+obj; // == String str2="재고 정보 = "+obj.toString();
		System.out.println(str2);
	}
}