package lab1;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException() {}
	public InsufficientFundsException(String message) {
		super(message);
	}
	
	public InsufficientFundsException(Throwable cause) {
		super(cause);
	}
}
