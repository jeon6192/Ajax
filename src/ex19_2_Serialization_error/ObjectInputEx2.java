package ex19_2_Serialization_error;

import java.io.*;

public class ObjectInputEx2 {
	public static void main(String[] args) {
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("output10.dat"));){
			while(true) {
				Rectangle obj=(Rectangle)in.readObject();
				System.out.println(obj.width);
				System.out.println(obj.height);
				System.out.println(obj.getArea());
			}
			
		}catch(FileNotFoundException fe) {
			System.out.println("파일이 존재하지 않습니다");
		}catch(EOFException eofe) {
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}catch(ClassNotFoundException cnfe) {
			System.out.println("불려오려는 객체의 클래스를 찾을수 없습니다");
		}
		
	}
}
