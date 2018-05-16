package ex18_10_File;

import java.io.File;
import java.util.GregorianCalendar;

public class FileEx1 {
	public static void main(String[] args) {
		File file=new File(".");
		File arr[]=file.listFiles();	// 서브 디렉토리와 파일 목록을 가져옵니다.
		
		for(int i=0;i<arr.length;i++) {
			String name=arr[i].getName();	// 이름을 리턴
			if(arr[i].isFile())	// 파일이면 true 아니면 false
				System.out.printf("%-25s %7d \t",name,arr[i].length());
			else 
				System.out.printf("%-25s   <DIR> \t",name);
			
			long time=arr[i].lastModified();
			GregorianCalendar calendar=new GregorianCalendar();
			calendar.setTimeInMillis(time);
			System.out.printf("%1$ty-%1$tm-%1$td %1$tH:%1$tM:%1$tS%n",calendar);
		}	// for
		
	}
}
