package ex19_2_Serialization_error;

import java.io.*;

public class ObjectInputEx2 {
	public static void main(String[] args) {
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("output10.dat"));){
			while(true) {
				Rectangle obj=(Rectangle)in.readObject();
				System.out.println(obj.width);
				System.out.println(obj.height);
				System.out.println(obj.getArea());
			}
			
		}catch(FileNotFoundException fe) {
			System.out.println("������ �������� �ʽ��ϴ�");
		}catch(EOFException eofe) {
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}catch(ClassNotFoundException cnfe) {
			System.out.println("�ҷ������� ��ü�� Ŭ������ ã���� �����ϴ�");
		}
		
	}
}
