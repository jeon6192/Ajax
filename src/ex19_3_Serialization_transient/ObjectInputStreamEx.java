package ex19_3_Serialization_transient;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
	public static void main(String[] args) {
		
		try(
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream("output3.dat"));){
			while(true) {
				BBSItem obj=(BBSItem)ois.readObject();
				
				System.out.println(BBSItem.itemNum);
				System.out.println(obj.writer);
				System.out.println(obj.passwd);
				System.out.println(obj.title);
				System.out.println(obj.content);
				
			}
		}catch(FileNotFoundException fe) {
			System.out.println("파일이 존재하지 않습니다");
		}catch(EOFException eofe) {
		}catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다");
		}catch(ClassNotFoundException cnfe) {
			System.out.println("불려오려는 객체의 클래스를 찾을수 없습니다");
		}
		
	}
}
