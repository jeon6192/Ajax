package ex7_1_object;

public class GoodsStock {
	String goodsCode;
	int stockNum;
	
	/*������ : �ν��Ͻ��� ������ �� ȣ��Ǵ� '�ν��Ͻ� �ʱ�ȭ �޼���' �Դϴ�.
	���� �ν��Ͻ� ������ �ʱ�ȭ �۾��� �ַ� ���Ǹ� �ν��Ͻ� �����ÿ� ����Ǿƾ� �� �۾��� ���ؼ��� ���˴ϴ�.*/
	public GoodsStock() {
		
	}
	public void addStock(int a) {
		stockNum+=a;
	}
	public int subtractStock(int a) {
		if(stockNum<a)	return 0;
		stockNum-=a;
		return a;
	}

}