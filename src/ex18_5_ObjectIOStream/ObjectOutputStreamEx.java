package ex18_5_ObjectIOStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputStreamEx {
	public static void main(String[] args) {
		try (FileOutputStream fos=new FileOutputStream("output.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos);)
			{
			oos.writeObject(new GregorianCalendar(2018, 2, 5));
			oos.writeObject(new GregorianCalendar(2018, 2, 6));
			oos.writeObject(new GregorianCalendar(2018, 2, 7));
		}catch(Exception e){}
		
	}
}
