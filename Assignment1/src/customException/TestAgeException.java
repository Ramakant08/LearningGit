package customException;

public class TestAgeException {

	 

    static void validateAge(int age) throws ValidateAgeException {
        if(age<18) {
            throw new ValidateAgeException("Your age is not valid to vote");
        }else {
            System.out.println("welcome to vote");
        }
    }
    public static void main(String[] args) throws ValidateAgeException {
        // TODO Auto-generated method stub
        validateAge(17);

 

    }

 

}