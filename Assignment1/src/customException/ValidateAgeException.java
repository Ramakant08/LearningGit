package customException;

public class ValidateAgeException extends Exception{
	 public ValidateAgeException(String exceptionMessage) {
	     super(exceptionMessage);
	 }
	}