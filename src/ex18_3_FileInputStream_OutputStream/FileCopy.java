package ex18_3_FileInputStream_OutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			in=new FileInputStream("koala.jpg");
			out=new FileOutputStream("koala2.jpg");
			while(true) {
				int data=in.read();
				if(data==-1) break;
				out.write(data);
			}
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			try {
				in.close();
				out.close();
			}catch(Exception e) {}
		}
		
	}
}
