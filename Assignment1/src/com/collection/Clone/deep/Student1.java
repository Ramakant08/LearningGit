package com.collection.Clone.deep;

public class Student1 {
	
		   int studentId;
		   String name;
		   Address1 address1=new Address1();
			
		   @Override
		   protected Object clone() throws CloneNotSupportedException {
			return super.clone();
			   
		   }

}
