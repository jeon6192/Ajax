package ex19_2_Serialization_error;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
	public static void main(String[] args) {
		
		try(
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream("output2.dat"));){
			while(true) {
				GoodsStock obj=(GoodsStock)ois.readObject();
				//String code=obj.code;
				//int num=obj.num;
			//	System.out.println("상품코드 : "+code+"\t 상품수량 : "+num);
				System.out.println(obj);
			}
		}catch(FileNotFoundException fe) {
			System.out.println("파일이 존재하지 않습니다");
		}catch(EOFException eofe) {
			System.out.println("끝");
		}catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다");
		}catch(ClassNotFoundException cnfe) {
			System.out.println("불려오려는 객체의 클래스를 찾을수 없습니다");
		}
		
	}
}
