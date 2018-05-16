package ex18_6_Buffered;

/*
 * 	 BufferedOuputStream �� ������
 * 	 BufferedOutputStream(OutputStream out) - size�� ���� ��� 8192 ����Ʈ ũ���� ���۸� �����ϴ�.
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
