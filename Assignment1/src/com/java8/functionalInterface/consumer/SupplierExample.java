package com.java8.functionalInterface.consumer;

import java.util.function.Supplier;

public class SupplierExample {

   public static void main(String[] args) {
		// TODO Auto-generated method stub
   Supplier<String> sup=()->"Books";
   Supplier<String> sup1=()->"Box";
   Supplier<String> sup2=()->"Pen";
   Supplier<String> sup3=()->"Sketches";
   System.out.println(sup.get()+" "+sup1.get()+" "+sup2.get()+" "+sup3.get());
	}

}
