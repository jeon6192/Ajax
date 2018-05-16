package ex12_2_User_Exception;

public class InvalidInputException extends Exception{
	public InvalidInputException() {
		super("잘못된 입력입니다");
	}
}
