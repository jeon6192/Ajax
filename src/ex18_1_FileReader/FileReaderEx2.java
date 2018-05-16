package ex18_1_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx2 {
	public static void main(String[] args) {
		
		FileReader reader=null;
		char[] arr=new char[64];
		try {
			reader=new FileReader("거위의 꿈.txt");
			while(true) {
				int num=reader.read(arr);
				if(num==-1)	break;
				System.out.println("읽어온 문자 수 = "+num);
				
				// 출력방법 1. arr의 0부터 num개 만큼 스트링으로 만든 후 출력
				System.out.println(new String(arr, 0, num));
				// 출력방법 2.
				/*for(int i=0;i<num;i++) {
					System.out.print(arr[i]);
				}*/
			}
			
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
