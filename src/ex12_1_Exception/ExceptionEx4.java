package ex12_1_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx4 {
	public static void main(String[] args) {
		try {
			FileReader reader=new FileReader("some.txt");
			reader.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
