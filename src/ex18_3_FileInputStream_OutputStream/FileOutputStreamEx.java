package ex18_3_FileInputStream_OutputStream;

import java.io.FileOutputStream;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		FileOutputStream out=null;
		try {
			out=new FileOutputStream("output1.dat");
			byte[] arr= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
			
			for(int cnt=0;cnt<arr.length;cnt++) {
				out.write(arr[cnt]);
			}
		}catch(Exception e) {
			
		}finally {
			try {
				out.close();
				System.out.println("������ �����߽��ϴ�.");
			}catch(Exception e) {}
			
		}
		
		
	}
}
