package ex8_11_abstract_ex;

class Store2 extends HeadQuarterStore{
	public Store2() {
		
	}

	@Override
	public void orderKimchijjige() {
		System.out.println("±èÄ¡Âî°³ - 5,000¿ø");		
	}
	@Override
	public void orderBudaejjige() {
		System.out.println("ºÎ´ëÂî°³ - 5,000¿ø");
	}
	@Override
	public void orderBiBibap() {
		System.out.println("ºñºö¹ä - 5,000¿ø");
	}
	@Override
	public void orderSunDaeguk() {
		System.out.println("¼ø´ë±¹ - 4,000¿ø");
	}
	@Override
	public void orderGongGibap() {
		System.out.println("°ø±â¹ä - ¹«·á");
	}

}
