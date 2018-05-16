package ex19_3_Serialization_transient;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputEx {
	public static void main(String[] args) {
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("output3.dat"));){
			BBSItem obj=new BBSItem("최선희", "sunshine", "정모합시다", "이번주 주말 어떠세요?");
			System.out.println("전체게시물의 수 : "+BBSItem.itemNum);
			System.out.println("글쓴이 : "+obj.writer);
			System.out.println("패스워드 : "+obj.passwd);
			System.out.println("제목 : "+obj.title);
			System.out.println("내용 : "+obj.content);
			out.writeObject(obj);
		}catch(Exception e) {}
		
	}
}
