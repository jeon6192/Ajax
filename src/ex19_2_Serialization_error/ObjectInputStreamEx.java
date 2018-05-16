package ex19_2_Serialization_error;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
	public static void main(String[] args) {
		
		try(
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream("output2.dat"));){
			while(true) {
				GoodsStock obj=(GoodsStock)ois.readObject();
				//String code=obj.code;
				//int num=obj.num;
			//	System.out.println("��ǰ�ڵ� : "+code+"\t ��ǰ���� : "+num);
				System.out.println(obj);
			}
		}catch(FileNotFoundException fe) {
			System.out.println("������ �������� �ʽ��ϴ�");
		}catch(EOFException eofe) {
			System.out.println("��");
		}catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�");
		}catch(ClassNotFoundException cnfe) {
			System.out.println("�ҷ������� ��ü�� Ŭ������ ã���� �����ϴ�");
		}
		
	}
}
