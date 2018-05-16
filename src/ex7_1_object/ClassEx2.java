package ex7_1_object;

public class ClassEx2 {
	public static void main(String args[]) {
		GoodsStock2 obj=new GoodsStock2();
		
		obj.goodsCode="52135";
		obj.stockNum=200;
		
		System.out.println("상품코드 : "+obj.goodsCode);
		System.out.println("재고수량 : "+obj.stockNum);
		
		obj.addStock(1000);
		System.out.println("상품코드 : "+obj.goodsCode);
		System.out.println("재고수량 : "+obj.stockNum);
	}
}
