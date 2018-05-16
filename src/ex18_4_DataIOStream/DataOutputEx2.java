package ex18_4_DataIOStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputEx2 {
	public static void main(String[] args) {
		DataOutputStream dos=null;
		try {
			dos=new DataOutputStream(new FileOutputStream("output.dat"));
			
			dos.writeUTF("즐거운 월요일 입니다");
			dos.writeDouble(3.14);
			dos.writeInt(3);
			dos.writeInt(4);
			dos.writeInt(5);
			
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
				dos.close();
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		
	}
}
