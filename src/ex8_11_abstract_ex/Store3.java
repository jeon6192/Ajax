package ex8_11_abstract_ex;

class Store3 extends HeadQuarterStore{
	public Store3() {
		
	}

	@Override
	public void orderKimchijjige() {
		System.out.println("��ġ� - 6,000��");		
	}
	@Override
	public void orderBudaejjige() {
		System.out.println("�δ�� - 7,000��");
	}
	@Override
	public void orderBiBibap() {
		System.out.println("����� - 7,000��");
	}
	@Override
	public void orderSunDaeguk() {
		System.out.println("���뱹 - 6,000��");
	}
	@Override
	public void orderGongGibap() {
		System.out.println("����� - 1000��");
	}

}
