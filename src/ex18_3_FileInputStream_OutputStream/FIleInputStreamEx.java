package ex18_3_FileInputStream_OutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleInputStreamEx {
	public static void main(String[] args) {
		if(args.length<1) {
			System.out.println("파일명을 Arguments탭에 'output1.dat'입력해주세요");
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
				System.out.println("16진수 출력");
				for(int i=0;i<num;i++) {
					System.out.printf("%02X ",arr[i]);
				}
				// %02X : 16진수(%X)를 대문자로출력, 앞자리가 0이면 0을붙여줌
				// %02x : 16진수(%x)를 소문자로출력, 앞자리가 0이면 0을붙여줌
				System.out.println("\n\n10진수 출력");
				for(int i=0;i<num;i++) {
					System.out.printf("%d ",arr[i]);
				}
				System.out.println("\n\n8진수 출력");
				for(int i=0;i<num;i++) {
					System.out.printf("%02o ",arr[i]);
				}
				
			}
		}catch(FileNotFoundException fe) {
			System.out.println(args[0]+" 파일이 존재하지 않습니다.");
		}catch(IOException ioe) {
			System.out.println(args[0]+" 파일을 읽을 수 없습니다.");
		}finally {
			try {
				in.close();
			}catch(Exception e) {}
		}
		
		
	}
}
