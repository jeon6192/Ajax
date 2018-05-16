package ex18_5_ObjectIOStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectInputStreamEx {
	public static void main(String[] args) {
		
		try(
				FileInputStream fis=new FileInputStream("output.dat");
				ObjectInputStream ois=new ObjectInputStream(fis);){
			while(true) {
				GregorianCalendar obj=(GregorianCalendar)ois.readObject();
				int year=obj.get(Calendar.YEAR);
				int month=obj.get(Calendar.MONTH);
				int date=obj.get(Calendar.DATE);
				System.out.println(year+"/"+(month+1)+"/"+date);
			}
		}catch(FileNotFoundException fe) {
			System.out.println("파일이 존재하지 않습니다");
		}catch(EOFException eofe) {
			System.out.println("End");
		}catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다");
		}catch(ClassNotFoundException cnfe) {
			System.out.println("불려오려는 객체의 클래스를 찾을수 없습니다");
		}
		
	}
}
