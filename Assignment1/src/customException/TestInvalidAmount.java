package customException;

public class TestInvalidAmount extends Exception {
   public TestInvalidAmount(String exeptionMessage) {
	   super(exeptionMessage);
   }
}
