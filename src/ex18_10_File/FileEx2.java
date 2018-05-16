package ex18_10_File;

import java.io.File;
import java.io.IOException;

public class FileEx2 {
	public static void main(String[] args) {
		String dir="d:\\newDirectory";
		File f2=new File(dir);
		if(!f2.exists()) {	// ���� ���� Ȯ��
			System.out.println("���� ���� ���丮 �̸� : "+f2.getPath());
			f2.mkdir();
		}else
			System.out.println("�̹� �ִ� ���丮 �̸� : "+f2.getPath());
		
		File f=new File(dir+"\\newFile.txt");
		
		if(f.exists()) {
			System.out.println(f.getPath()+"��ο� "+f.getName()+"������ �ֽ��ϴ�.");
		}else {
			try {
				f.createNewFile();
				System.out.println(f.getPath()+"�� ���ο� ������ ��������ϴ�.");
			}catch(IOException ioe) {}
		}
		
		File f3=new File(dir+"\\newFile.txt");
		if(f3.exists()) {
			if(f3.delete())
				System.out.println(f3.getPath()+" �����߽��ϴ�.");
			else
				System.out.println(f3.getPath()+" ���� ���� ���߽��ϴ�.");
		}else {
			System.out.println(f3.getPath()+"�� �����ϰ��� �ϴ� ������ �����ϴ�.");
		}
		
		File f4=new File(dir);
		if(f4.exists()) {
			if(f4.delete())
				System.out.println(f3.getPath()+" �����߽��ϴ�.");
			else
				System.out.println(f3.getPath()+" ���� ���� ���߽��ϴ�.");
		}else {
			System.out.println(f3.getPath()+"�� �����ϰ��� �ϴ� ���丮�� �����ϴ�.");
		}
		
				
		
	}
}
