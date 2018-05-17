package net.member.action;

/*
	ActionForward Ŭ������ Action �������̽����� ����� �����ϰ� ��� ���� ������ ������ �Ҷ� ���Ǵ� Ŭ����
	�� Ŭ������ Redirect ���� ���� �������� �������� ��ġ�� ������ �ֽ��ϴ�.
	�� ������ ForntController���� ActionForwardŬ���� Ÿ������ ��ȯ����
	�������� �� ���� Ȯ���Ͽ� �ش��ϴ� ��û �������� ������ ó���� �մϴ�. 
*/

public class ActionForward {
	private boolean redirect;
	private String path;
	
	
	public ActionForward() {
		super();
	}
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	

}
