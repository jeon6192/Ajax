package ex8_11_abstract_ex;

class Store2 extends HeadQuarterStore{
	public Store2() {
		
	}

	@Override
	public void orderKimchijjige() {
		System.out.println("��ġ� - 5,000��");		
	}
	@Override
	public void orderBudaejjige() {
		System.out.println("�δ�� - 5,000��");
	}
	@Override
	public void orderBiBibap() {
		System.out.println("����� - 5,000��");
	}
	@Override
	public void orderSunDaeguk() {
		System.out.println("���뱹 - 4,000��");
	}
	@Override
	public void orderGongGibap() {
		System.out.println("����� - ����");
	}

}
