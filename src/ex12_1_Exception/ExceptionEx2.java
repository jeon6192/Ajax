package ex12_1_Exception;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int num1=3, num2=0;
		try {
			int result=num1/num2;
			System.out.println(result);
		}catch(Exception e){
			//e.printStackTrace(System.err);
			System.err.println(e.getMessage());
		}finally {
			System.out.println("������");
		}
		
		
		
	}
	
}
