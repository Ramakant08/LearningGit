package com.Switch.Continue.Break;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int c;
    int a,b;
    String ch;
    
    System.out.println("enter any two numbers: ");
    Scanner sc= new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    
    operations opr= new operations(a,b);
    System.out.println("Operations: \n1.Addition \n2.Subtraction \n3.Multiplcation \n4.Division ");
    do {
    	 
    	System.out.println("enter choice: ");
        c=sc.nextInt();
        
        switch(c) {
        
        case 1:System.out.println("Sum is "+ opr.addition(opr.getA(),opr.getB()));
               break;
        case 2:System.out.println("Subtraction is "+ opr.subtraction(opr.getA(),opr.getB()));
               break;
        case 3:System.out.println("multiplication is "+ opr.multiplcation(opr.getA(),opr.getB()));
               break;
        case 4:System.out.println("division is "+ opr.division(opr.getA(),opr.getB()));
               break;

        }
    System.out.println("want to continue? (Y/N)");  
    ch=sc.next();
    }while(ch!="n" || ch!="N");
    
    sc.close();
    
   }
}
