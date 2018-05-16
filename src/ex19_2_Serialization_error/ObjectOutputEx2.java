package ex19_2_Serialization_error;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputEx2 {
	public static void main(String[] args) {
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("output10.dat"));){
			Rectangle obj=new Rectangle(100, 100);
			
			System.out.println(obj.width);
			System.out.println(obj.height);
			System.out.println("직렬화 합니다.");
			out.writeObject(obj);
			
		}catch(Exception e) {}
	}
}
