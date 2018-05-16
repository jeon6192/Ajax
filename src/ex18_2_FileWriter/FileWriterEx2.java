package ex18_2_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx2 {
	public static void main(String[] args) {
		FileWriter writer=null;
		try {
			writer=new FileWriter("구구단.txt", false);	// true : append(원래 내용에 추가), false : overwrite
			// FileWriter 생성자의 매개변수가 열 파일의 이름을 의미함
			// 해당 파일이없는 경우 파일을 생성함
			// 기존에 같은 이름의 파일이있을경우 기존파일의 내용이 지워짐
			
			for(int a=2;a<10;a++) {
				writer.write("["+a+"단]\t");
			}
			writer.write("\r\n");
			for(int i=1;i<10;i++) {
				for(int j=2;j<10;j++) {
					writer.write(j+"*"+i+"="+i*j+"\t");
				}
				writer.write("\r\n");
			}
		
		}catch(IOException e) {
			System.out.println("파일을 출력할 수 없습니다.");
		}finally {
			try {
				writer.close();	// 3. 파일 닫기
			}catch(Exception e) {}
		}
		
	}
}
