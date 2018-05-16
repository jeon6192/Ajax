package ex18_4_DataIOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputEx2 {
	
	public static void main(String[] args) {
		DataInputStream dis=null;
		try {
			dis=new DataInputStream(new FileInputStream("output.dat"));
			System.out.println(dis.readUTF());
			double d=dis.readDouble();
			System.out.println(d);
			System.out.println(dis.readInt());
			System.out.println(dis.readInt());
			System.out.println(dis.readInt());
			
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ioe) {
		}finally {
			try {
				dis.close();
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		
	}
	
}
