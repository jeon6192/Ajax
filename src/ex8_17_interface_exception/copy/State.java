package ex8_17_interface_exception.copy;

enum State {
	STATE_NORMAL("���Ⱑ��"), STATE_BORROWED("������");
	final private String state;
	private State(String state) {
		this.state=state;
	}
	String getState() {
		return state;
	}

}
