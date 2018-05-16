package ex8_11_abstract_ex;

class Store3 extends HeadQuarterStore{
	public Store3() {
		
	}

	@Override
	public void orderKimchijjige() {
		System.out.println("±èÄ¡Âî°³ - 6,000¿ø");		
	}
	@Override
	public void orderBudaejjige() {
		System.out.println("ºÎ´ëÂî°³ - 7,000¿ø");
	}
	@Override
	public void orderBiBibap() {
		System.out.println("ºñºö¹ä - 7,000¿ø");
	}
	@Override
	public void orderSunDaeguk() {
		System.out.println("¼ø´ë±¹ - 6,000¿ø");
	}
	@Override
	public void orderGongGibap() {
		System.out.println("°ø±â¹ä - 1000¿ø");
	}

}
