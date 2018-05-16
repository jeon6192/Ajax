package ex18_6_Buffered;

/*
 * 	 BufferedOuputStream 의 생성자
 * 	 BufferedOutputStream(OutputStream out) - size가 없는 경우 8192 바이트 크기의 버퍼를 갖습니다.
 *	 BufferedOutputStream(OutputStream out, int size)
 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {
	public static void main(String[] args) {
		try(
				BufferedOutputStream out=
				new BufferedOutputStream(new FileOutputStream("output.txt"));
		){
			byte[] arr= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
			
			for(int cnt=0;cnt<arr.length;cnt++) {
				out.write(arr[cnt]);
			}
		}catch(Exception e) {
		}
		
		
	}
}
