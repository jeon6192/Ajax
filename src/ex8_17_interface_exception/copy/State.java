package ex8_17_interface_exception.copy;

enum State {
	STATE_NORMAL("대출가능"), STATE_BORROWED("대출중");
	final private String state;
	private State(String state) {
		this.state=state;
	}
	String getState() {
		return state;
	}

}
