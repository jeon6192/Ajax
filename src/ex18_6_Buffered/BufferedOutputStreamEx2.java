package ex18_6_Buffered;

/*
 * 	 BufferedOuputStream 의 생성자
 * 	 BufferedOutputStream(OutputStream out) - size가 없는 경우 8192 바이트 크기의 버퍼를 갖습니다.
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
			// BufferedStream을 닫아주면 버피에 담지못하고 남은 데이터가 밖으로 나가 출력하게됨
			// FileStream을 먼저 닫아주면 남은 데이터가 나가지 못하므로 순서도 중요하다
			
		}catch(Exception e) {
		}
		
		
	}
}