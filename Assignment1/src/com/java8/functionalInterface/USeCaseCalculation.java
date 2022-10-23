package com.java8.functionalInterface;

public class USeCaseCalculation  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalCalculation sum=(a,b)->(a+b);
		System.out.println("Sum: "+sum.addMethod(120,13));
		FunctionalCalculation sub=(a,b)->(a-b);
		System.out.println("Subtraction: "+sub.addMethod(12,13));
		FunctionalCalculation mul=(a,b)->(a*b);
		System.out.println("Multiplication: "+mul.addMethod(12,13));
		FunctionalCalculation div=(a,b)->(a/b);
		System.out.println("Division: "+div.addMethod(12,13));
	}

}
