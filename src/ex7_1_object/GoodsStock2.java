package ex7_1_object;

public class GoodsStock2 {
	
	
	/*생성자 : 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드' 입니다.
	따라서 인스턴스 변수의 초기화 작업에 주로 사용되며 인스턴스 생성시에 실행되아야 할 작업을 위해서도 사용됩니다.*/
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