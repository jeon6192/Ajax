package ex12_1_Exception;

public class ExceptionEx {
	public static void main(String[] args) {
		int sum=1+-2;
		
		try {
			if(sum<0)	throw new Exception("error");			
			System.out.println(sum);
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	static int add(int a, int b) throws Exception{
		int result=a+b;
		if(result<0)	throw new Exception("error");
		return result;
	}
}
