package ex8_11_abstract_ex;

class Store1 extends HeadQuarterStore{
	public Store1() {
		
	}

	@Override
	public void orderKimchijjige() {
		System.out.println("��ġ� - 4,500��");		
	}
	@Override
	public void orderBudaejjige() {
		System.out.println("�δ�� - 5,000��");
	}
	@Override
	public void orderBiBibap() {
		System.out.println("����� - 6,000��");
	}
	@Override
	public void orderSunDaeguk() {
		System.out.println("���뱹 - �Ǹ����� ����");
	}
	@Override
	public void orderGongGibap() {
		System.out.println("����� - 1,000��");
	}

}
