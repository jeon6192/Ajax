package ex18_3_FileInputStream_OutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleInputStreamEx {
	public static void main(String[] args) {
		if(args.length<1) {
			System.out.println("���ϸ��� Arguments�ǿ� 'output1.dat'�Է����ּ���");
			return;
		}
		FileInputStream in=null;
		try {
			in=new FileInputStream(args[0]);
			byte[] arr=new byte[20];
			while(true) {
				int num=in.read(arr);
				if(num<0)
					break;
				System.out.println("16���� ���");
				for(int i=0;i<num;i++) {
					System.out.printf("%02X ",arr[i]);
				}
				// %02X : 16����(%X)�� �빮�ڷ����, ���ڸ��� 0�̸� 0���ٿ���
				// %02x : 16����(%x)�� �ҹ��ڷ����, ���ڸ��� 0�̸� 0���ٿ���
				System.out.println("\n\n10���� ���");
				for(int i=0;i<num;i++) {
					System.out.printf("%d ",arr[i]);
				}
				System.out.println("\n\n8���� ���");
				for(int i=0;i<num;i++) {
					System.out.printf("%02o ",arr[i]);
				}
				
			}
		}catch(FileNotFoundException fe) {
			System.out.println(args[0]+" ������ �������� �ʽ��ϴ�.");
		}catch(IOException ioe) {
			System.out.println(args[0]+" ������ ���� �� �����ϴ�.");
		}finally {
			try {
				in.close();
			}catch(Exception e) {}
		}
		
		
	}
}
