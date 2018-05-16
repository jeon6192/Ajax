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
			System.out.println("������ �������ϴ�");
			
			oos.writeObject(new StringTokenizer("a|b|c","|"));
			System.out.println("���Ϸ� StringTokenizer ��ü�� ����մϴ�");
			
			
		}catch(FileNotFoundException fe) {
			System.out.println("������ �������� �ʽ��ϴ�");
		}catch(EOFException eofe) {
			System.out.println("End");
		}catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println("���Ϸ� ����� �� �����ϴ�");
		}
		
	}
}
