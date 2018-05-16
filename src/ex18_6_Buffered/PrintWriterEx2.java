package ex18_6_Buffered;

import java.io.PrintWriter;
import java.util.GregorianCalendar;

public class PrintWriterEx2 {
	public static void main(String[] args) {
		try(PrintWriter writer=new PrintWriter("output.txt")){
			writer.println("        *** ����ǥ ***        ");
			
			writer.printf("%5s : %3d %3d %3d %5.1f %n", "������",92,87,95,91.3f);
			writer.printf("%5s : %3d %3d %3d %5.1f %n", "������",100,90,88,92.7f);
			writer.printf("%-5s : %3d %3d %3d %5.1f %n", "�ֹ���",75,88,85,82.7f);
			
			writer.printf("�ۼ�����1   : %1$tY�� %1$tm�� %1$td�� "+"  %1$tp %1$tH�� %n", new GregorianCalendar());
			writer.printf("�ۼ�����2   : %1$ty�� %1$tm�� %1$td�� "+" %1$tp %1$tI�� %n", new GregorianCalendar());
			writer.printf("�ۼ�����3   : %1$ty�� %1$tB %1$td�� "+"  %1$tA %1$tp %1$tl�� %1$tM�� %1$tS %n", new GregorianCalendar());
		}catch(Exception e) {}
	}
}
