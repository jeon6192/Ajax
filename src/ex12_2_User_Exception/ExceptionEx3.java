package ex12_2_User_Exception;

public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			int result=devide(3, 0);
			System.out.println(result);
		} catch (InvalidInputException e) {
			System.err.println("error");
		}
		
		
	}
	
	static int devide(int a, int b) throws InvalidInputException{	// uncheckedException 이기때문에 예외발생코드가 필요치않다.
		int result=a/b;
		return result;
	}
}
