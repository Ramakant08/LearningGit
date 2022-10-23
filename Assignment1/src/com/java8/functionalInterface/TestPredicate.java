package com.java8.functionalInterface;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* int i=20;
       if(i<10) {
    	   System.out.println("value < 20");
       }
       else
    	   System.out.println("value > 20");
    	   */
       //using predicates:
       Predicate<Integer> testEquality = i->(i%10<5);
       System.out.println(testEquality.test(20));
       System.out.println(testEquality.test(25));
	}

}
