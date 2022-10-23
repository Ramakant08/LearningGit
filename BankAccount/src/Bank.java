import java.util.*;

public class Bank {
  String name=" ";
  int acc_no,balance,deposit,withdraw;
	public Bank() {
		this.name=name;
		this.acc_no=acc_no;
		this.balance=balance;
		this.withdraw=withdraw;
		// TODO Auto-generated constructor stub
	}
	public void enter_details() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer name:");
		name=sc.nextLine();
		System.out.println("enter account no. :");
		acc_no=sc.nextInt();
		sc.close();
	}
	public void deposit_money() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to deposit: ");
		deposit=sc.nextInt();
		balance=balance+ deposit;
		sc.close();
	}
	public void withdraw_money() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to withdraw:");
		withdraw=sc.nextInt();
		balance= balance-withdraw;
		sc.close();
	}
    public void display_details() {
    	System.out.println("name of account holder "+name);
    	System.out.println("Account no. :"+acc_no);
    	System.out.println("balance: "+balance);
    }
}

class Main {
	public static void main(String args[ ]) {
		System.out.println("enter the no.of customers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Bank b=new Bank();
		int c;
		char ch = 0;
		do {
			System.out.println("Menu:");
			System.out.println("1.enter customer details");
			System.out.println("2.deposite money to the account");
			System.out.println("3.withdraw money from the account");
			System.out.println("enter choice");
			
			c=sc.nextInt();
			switch(c) {
			case 1:b.enter_details();
			       break;
			case 2:b.deposit_money();
			       break;
			case 3:b.withdraw_money();
			       break;
			default:System.out.println("out of choice !");
			}
		}while(ch=='y');
	}
}