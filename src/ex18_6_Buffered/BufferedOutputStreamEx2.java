package ex18_6_Buffered;

/*
 * 	 BufferedOuputStream �� ������
 * 	 BufferedOutputStream(OutputStream out) - size�� ���� ��� 8192 ����Ʈ ũ���� ���۸� �����ϴ�.
 *	 BufferedOutputStream(OutputStream out, int size)
 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx2 {
	public static void main(String[] args) {
		try{
			FileOutputStream fos=new FileOutputStream("123.txt");
			BufferedOutputStream out=
			new BufferedOutputStream(fos,5);
		
			for(int i='1';i<='9';i++) {
				out.write(i);
			}
			out.flush();
			//out.close();
			fos.close();
			// BufferedStream�� �ݾ��ָ� ���ǿ� �������ϰ� ���� �����Ͱ� ������ ���� ����ϰԵ�
			// FileStream�� ���� �ݾ��ָ� ���� �����Ͱ� ������ ���ϹǷ� ������ �߿��ϴ�
			
		}catch(Exception e) {
		}
		
		
	}
}