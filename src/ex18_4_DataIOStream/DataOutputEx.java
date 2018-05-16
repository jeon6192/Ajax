package ex18_4_DataIOStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	 DataOutputStream은 기본형 데이터를 바이트스트림으로 만들어서 출력하는 기능입니다
 * 	 파일에 데이터를 쓰는 기능은없기 때문에 객체생성시에 생성자안에 
 * 	 FileOutputStream을 파라미터로 넘겨줌
 */

public class DataOutputEx {
	public static void main(String[] args) {
		DataOutputStream dos=null;
		try {
			dos=new DataOutputStream(new FileOutputStream("output.dat"));
			
			int[] arr= {0,1,2,3,4,5,6,7,8,9};
			for(int i=0;i<arr.length;i++) {
				dos.writeInt(arr[i]);
			}
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
