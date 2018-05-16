package ex18_5_ObjectIOStream;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.StringTokenizer;

public class ObjectOutputStreamEx2 implements Serializable{
	public static void main(String[] args) {
		try(
				FileOutputStream fis=new FileOutputStream("output.dat");
				ObjectOutputStream oos=new ObjectOutputStream(fis);){
			System.out.println("파일을 열었습니다");
			
			oos.writeObject(new StringTokenizer("a|b|c","|"));
			System.out.println("파일로 StringTokenizer 객체를 출력합니다");
			
			
		}catch(FileNotFoundException fe) {
			System.out.println("파일이 존재하지 않습니다");
		}catch(EOFException eofe) {
			System.out.println("End");
		}catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println("파일로 출력할 수 없습니다");
		}
		
	}
}
