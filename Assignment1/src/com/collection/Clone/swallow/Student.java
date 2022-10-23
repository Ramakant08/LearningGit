package com.collection.Clone.swallow;

public class Student implements Cloneable {
   int studentId;
   String name;
   Address address=new Address();
	
   @Override
   protected Object clone() throws CloneNotSupportedException {
	return super.clone();
	   
   }

}
