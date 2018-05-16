package ex18_2_FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx2 {
	public static void main(String[] args) {
		
		FileReader reader=null;
		char[] arr=new char[18];
		try {
			reader=new FileReader("output.txt");
			while(true) {
				int num=reader.read(arr);
				if(num==-1)	break;
				
				// ��¹�� 1. arr�� 0���� num�� ��ŭ ��Ʈ������ ���� �� ���
				System.out.println(new String(arr, 0, num));
				System.out.println();
				// ��¹�� 2.
				/*for(int i=0;i<num;i++) {
					System.out.print(arr[i]);
				}*/
			}
			
		}catch (FileNotFoundException fe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		}catch(NullPointerException n) {
			System.out.println("NullPointerException ���� �߻�");
		}finally {
			try {
				reader.close();	// 3. ���� �ݱ�
			}catch(Exception e) {}
		}
		
	}
	
}
