package com.java8.functionalInterface;

public interface Car {
 
	 public void accelerate();
	 public void breaking();// abstract method
	 default void non_abstract() {
		 //can give implementation of non abstracts
		 System.out.println("definition of function here");
	 }
	 //static and non abstract methods can be implemented in an interface
	 public static void static_method() {
		 System.out.println("Static function definition here");
	 }
}
