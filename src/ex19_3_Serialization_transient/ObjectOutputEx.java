package ex19_3_Serialization_transient;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputEx {
	public static void main(String[] args) {
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("output3.dat"));){
			BBSItem obj=new BBSItem("�ּ���", "sunshine", "�����սô�", "�̹��� �ָ� �����?");
			System.out.println("��ü�Խù��� �� : "+BBSItem.itemNum);
			System.out.println("�۾��� : "+obj.writer);
			System.out.println("�н����� : "+obj.passwd);
			System.out.println("���� : "+obj.title);
			System.out.println("���� : "+obj.content);
			out.writeObject(obj);
		}catch(Exception e) {}
		
	}
}
