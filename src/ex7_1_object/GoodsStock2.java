package ex7_1_object;

public class GoodsStock2 {
	
	
	/*������ : �ν��Ͻ��� ������ �� ȣ��Ǵ� '�ν��Ͻ� �ʱ�ȭ �޼���' �Դϴ�.
	���� �ν��Ͻ� ������ �ʱ�ȭ �۾��� �ַ� ���Ǹ� �ν��Ͻ� �����ÿ� ����Ǿƾ� �� �۾��� ���ؼ��� ���˴ϴ�.*/
	public GoodsStock2() {
		
	}
	public void addStock(int a) {
		stockNum+=a;
	}
	public int subtractStock(int a) {
		if(stockNum<a)	return 0;
		stockNum-=a;
		return a;
	}
	String goodsCode;
	int stockNum;

}