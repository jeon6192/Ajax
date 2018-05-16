package ex18_6_Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx2 {
	static int cnt=0;
	public static void main(String[] args) {
		
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("123.txt")); 
		){
		}catch(Exception e) {}
		
	}
}
