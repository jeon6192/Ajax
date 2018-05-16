package ex18_2_FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx3 {
	public static void main(String[] args) {
		
		FileReader reader=null;
		try {
			reader = new FileReader("구구단.txt");	// 1. 파일 열기  // %workspace/프로젝트명/
			while(true) {
				int data=reader.read();	// 2. 파일 읽어오기
				if(data==-1) {	// -1 : End of File
					break;
				}
				char ch=(char)data;
				System.out.print(ch);
			} // while
			
		}catch (FileNotFoundException fe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}catch(NullPointerException n) {
			System.out.println("NullPointerException 예외 발생");
		}finally {
			try {
				reader.close();	// 3. 파일 닫기
			}catch(Exception e) {}
		}
		
	}
	
}
