package ex18_6_Buffered;

import java.io.PrintWriter;
import java.util.GregorianCalendar;

public class PrintWriterEx2 {
	public static void main(String[] args) {
		try(PrintWriter writer=new PrintWriter("output.txt")){
			writer.println("        *** 성적표 ***        ");
			
			writer.printf("%5s : %3d %3d %3d %5.1f %n", "김지영",92,87,95,91.3f);
			writer.printf("%5s : %3d %3d %3d %5.1f %n", "박현식",100,90,88,92.7f);
			writer.printf("%-5s : %3d %3d %3d %5.1f %n", "최민재",75,88,85,82.7f);
			
			writer.printf("작성일자1   : %1$tY년 %1$tm월 %1$td일 "+"  %1$tp %1$tH시 %n", new GregorianCalendar());
			writer.printf("작성일자2   : %1$ty년 %1$tm월 %1$td일 "+" %1$tp %1$tI시 %n", new GregorianCalendar());
			writer.printf("작성일자3   : %1$ty년 %1$tB %1$td일 "+"  %1$tA %1$tp %1$tl시 %1$tM분 %1$tS %n", new GregorianCalendar());
		}catch(Exception e) {}
	}
}
