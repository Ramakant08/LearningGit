package com.java8.functionalInterface.consumer;

import java.util.function.Consumer;


public class TestConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student std1=new Student(5,"ABC");
     Student std2=new Student(6,"DEF");
     
     Consumer<Student> con= obj ->{
    	 System.out.println(obj.getRollNo());
    	 System.out.println(obj.getName());
     };
     System.out.println("for first student data");
     con.accept(std1);
     System.out.println("for first student data");
     con.accept(std2);
	}

}
