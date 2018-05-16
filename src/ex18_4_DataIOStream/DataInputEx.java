package ex18_4_DataIOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DataInputEx extends DataInputStream {
	public DataInputEx(InputStream in) {
		super(in);
	}
	
	@Override
	public int read() throws IOException {
		return super.read();
	}
	
	public static void main(String[] args) {
		DataInputStream dis=null;
		try {
			dis=new DataInputStream(new FileInputStream("output.dat"));
			while(true) {
				int num=dis.readInt();
				System.out.print(num+" ");
			}
			
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ioe) {
			System.out.println("End");	// EOF를 알수없기때문에 Exception에서 끝이라고 처리
		}finally {
			try {
				dis.close();
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		
	}
	
}
