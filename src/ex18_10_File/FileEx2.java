package ex18_10_File;

import java.io.File;
import java.io.IOException;

public class FileEx2 {
	public static void main(String[] args) {
		String dir="d:\\newDirectory";
		File f2=new File(dir);
		if(!f2.exists()) {	// 존재 유무 확인
			System.out.println("새로 만든 디렉토리 이름 : "+f2.getPath());
			f2.mkdir();
		}else
			System.out.println("이미 있는 디렉토리 이름 : "+f2.getPath());
		
		File f=new File(dir+"\\newFile.txt");
		
		if(f.exists()) {
			System.out.println(f.getPath()+"경로에 "+f.getName()+"파일이 있습니다.");
		}else {
			try {
				f.createNewFile();
				System.out.println(f.getPath()+"에 새로운 파일을 만들었습니다.");
			}catch(IOException ioe) {}
		}
		
		File f3=new File(dir+"\\newFile.txt");
		if(f3.exists()) {
			if(f3.delete())
				System.out.println(f3.getPath()+" 삭제했습니다.");
			else
				System.out.println(f3.getPath()+" 삭제 하지 못했습니다.");
		}else {
			System.out.println(f3.getPath()+"에 삭제하고자 하는 파일이 없습니다.");
		}
		
		File f4=new File(dir);
		if(f4.exists()) {
			if(f4.delete())
				System.out.println(f3.getPath()+" 삭제했습니다.");
			else
				System.out.println(f3.getPath()+" 삭제 하지 못했습니다.");
		}else {
			System.out.println(f3.getPath()+"에 삭제하고자 하는 디렉토리가 없습니다.");
		}
		
				
		
	}
}
