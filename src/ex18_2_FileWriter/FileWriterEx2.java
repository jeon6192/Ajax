package ex18_2_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx2 {
	public static void main(String[] args) {
		FileWriter writer=null;
		try {
			writer=new FileWriter("������.txt", false);	// true : append(���� ���뿡 �߰�), false : overwrite
			// FileWriter �������� �Ű������� �� ������ �̸��� �ǹ���
			// �ش� �����̾��� ��� ������ ������
			// ������ ���� �̸��� ������������� ���������� ������ ������
			
			for(int a=2;a<10;a++) {
				writer.write("["+a+"��]\t");
			}
			writer.write("\r\n");
			for(int i=1;i<10;i++) {
				for(int j=2;j<10;j++) {
					writer.write(j+"*"+i+"="+i*j+"\t");
				}
				writer.write("\r\n");
			}
		
		}catch(IOException e) {
			System.out.println("������ ����� �� �����ϴ�.");
		}finally {
			try {
				writer.close();	// 3. ���� �ݱ�
			}catch(Exception e) {}
		}
		
	}
}
