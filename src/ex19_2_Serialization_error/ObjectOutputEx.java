package ex19_2_Serialization_error;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputEx {
	public static void main(String[] args) {
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("output2.dat"));){
			out.writeObject(new GoodsStock("70101", 100));
			out.writeObject(new GoodsStock("70102", 50));
			out.writeObject(new GoodsStock("70103", 200));
			System.out.println("���Ϸ� ��� �Ǿ����ϴ�.");
		}catch(IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
			ioe.printStackTrace();
		}
		
	}
}
