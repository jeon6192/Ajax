package ex8_17_interface_exception.copy2;

interface Lendable2 {
	enum State{
		STATE_NORMAL("���Ⱑ��"), STATE_BORROWED("������");
		final private String state;
		private State(String state) {
			this.state=state;
		}
		String getState() {
			return state;
		}
	}
	
	public abstract void checkOut(String borrower, String date) throws Exception;
	
	public abstract void checkIn();
	

}
