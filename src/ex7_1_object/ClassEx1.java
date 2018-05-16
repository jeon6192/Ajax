package ex7_1_object;

public class ClassEx1 {
	public static void main(String args[]) {
		GoodsStock obj=new GoodsStock();
		
		obj.goodsCode="52135";
		obj.stockNum=200;
		
		System.out.println("상품코드 : "+obj.goodsCode);
		System.out.println("재고수량 : "+obj.stockNum);
		
		obj.addStock(1000);
		System.out.println("상품코드 : "+obj.goodsCode);
		System.out.println("재고수량 : "+obj.stockNum);
	}
}
