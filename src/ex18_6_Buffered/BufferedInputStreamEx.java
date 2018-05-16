package ex18_6_Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {
	static int cnt=0;
	public static void main(String[] args) {
		
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("output.txt")); 
		){
			byte[] arr=new byte[20];
			while(true) {
				int num=bis.read(arr);
				if(num<0)	break;
				for(int i=0;i<num;i++) {
					System.out.printf("%d ",arr[i]);
				}
				
			}
		}catch(Exception e) {}
		
	}
}
