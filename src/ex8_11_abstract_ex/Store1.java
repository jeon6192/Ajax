package ex8_11_abstract_ex;

class Store1 extends HeadQuarterStore{
	public Store1() {
		
	}

	@Override
	public void orderKimchijjige() {
		System.out.println("김치찌개 - 4,500원");		
	}
	@Override
	public void orderBudaejjige() {
		System.out.println("부대찌개 - 5,000원");
	}
	@Override
	public void orderBiBibap() {
		System.out.println("비빔밥 - 6,000원");
	}
	@Override
	public void orderSunDaeguk() {
		System.out.println("순대국 - 판매하지 않음");
	}
	@Override
	public void orderGongGibap() {
		System.out.println("공기밥 - 1,000원");
	}

}
