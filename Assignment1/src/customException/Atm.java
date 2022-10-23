package customException;
import java.util.*;

public class Atm {
	static int amount;
	static int withdrawl;
	static int balance=1000;
	
	public static int deposit(int amount,int balance) throws TestInvalidAmount{
		if(amount<=0) {
			throw new TestInvalidAmount("invalid amount ");
		}
		else {
			System.out.println("Rs."+amount+" is deposited");
			System.out.println("Rs."+(amount+balance)+" after deposition");
		}
		return balance;
	}
	public static void withdraw(int balance,int amount) throws TestInvalidAmount{
		
		if(balance<amount) {
			throw new TestInvalidAmount("insufficient fund");
		}
		else {
			System.out.println("Rs."+(balance-amount)+" is in your account after withdrawing Rs."+amount);
		}
	}
	public static void main(String args[]) throws TestInvalidAmount{
		Scanner sc= new Scanner(System.in);
	    balance=sc.nextInt();
		System.out.println("enter deposit amount");
		amount=sc.nextInt();
		System.out.println("enter withdrawl amount");
		withdrawl=sc.nextInt();
		withdraw(balance,withdrawl);
		deposit(amount,balance);
		 
		 sc.close();
	}
}
