package ex18_4_DataIOStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	 DataOutputStream�� �⺻�� �����͸� ����Ʈ��Ʈ������ ���� ����ϴ� ����Դϴ�
 * 	 ���Ͽ� �����͸� ���� ��������� ������ ��ü�����ÿ� �����ھȿ� 
 * 	 FileOutputStream�� �Ķ���ͷ� �Ѱ���
 */

public class DataOutputEx {
	public static void main(String[] args) {
		DataOutputStream dos=null;
		try {
			dos=new DataOutputStream(new FileOutputStream("output.dat"));
			
			int[] arr= {0,1,2,3,4,5,6,7,8,9};
			for(int i=0;i<arr.length;i++) {
				dos.writeInt(arr[i]);
			}
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
				dos.close();
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		
	}
}
