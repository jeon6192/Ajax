package ex18_5_ObjectIOStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class ObjectInputStreamEx2 {
	public static void main(String[] args) {
		
		try(
				FileInputStream fis=new FileInputStream("output.dat");
				ObjectInputStream ois=new ObjectInputStream(fis);){
			while(true) {
				StringTokenizer st=(StringTokenizer)ois.readObject();
				if(st.hasMoreTokens()) {
					System.out.println(st.nextToken());
				}
			}
		}catch(FileNotFoundException fe) {
			System.out.println("������ �������� �ʽ��ϴ�");
		}catch(EOFException eofe) {
			System.out.println("End");
		}catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�");
		}catch(ClassNotFoundException cnfe) {
			System.out.println("�ҷ������� ��ü�� Ŭ������ ã���� �����ϴ�");
		}
		
	}
}
