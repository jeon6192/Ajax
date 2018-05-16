package ex18_2_FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx3 {
	public static void main(String[] args) {
		
		FileReader reader=null;
		try {
			reader = new FileReader("������.txt");	// 1. ���� ����  // %workspace/������Ʈ��/
			while(true) {
				int data=reader.read();	// 2. ���� �о����
				if(data==-1) {	// -1 : End of File
					break;
				}
				char ch=(char)data;
				System.out.print(ch);
			} // while
			
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
