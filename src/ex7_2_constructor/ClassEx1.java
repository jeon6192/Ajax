package ex7_2_constructor;

public class ClassEx1 {
	public static void main(String args[]) {
		GoodsStock obj=new GoodsStock("52135",200);
		
		System.out.println("��ǰ�ڵ� : "+obj.goodsCode);
		System.out.println("������� : "+obj.stockNum);
		
		obj.addStock(1000);
		System.out.println("��ǰ�ڵ� : "+obj.goodsCode);
		System.out.println("������� : "+obj.stockNum);
	}
}