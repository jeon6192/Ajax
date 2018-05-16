package ex19_3_Serialization_transient;

public class BBSItem implements java.io.Serializable{
	static int itemNum=0;
	String writer;
	transient String passwd;
	String title;;
	String content;
	
	public BBSItem(String writer, String passwd, String title, String content) {
		super();
		this.writer = writer;
		this.passwd = passwd;
		this.title = title;
		this.content = content;
		itemNum++;
	}
	
	void modifyContent(String content, String passwd) {
		if(!passwd.equals(this.passwd))
			return;
		this.content=content;
	}
	
	
}
