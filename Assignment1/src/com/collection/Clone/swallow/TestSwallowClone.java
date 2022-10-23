package com.collection.Clone.swallow;

public class TestSwallowClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s1= new Student();
		s1.name="Pratibha";
		s1.studentId=101;
		s1.address=new Address(212323,"Delhi");
		
		System.out.println("data of student 1");
		System.out.println("name: "+s1.name+" Roll no:"+s1.studentId+" Address: "+s1.address.pinCode+","+s1.address.city);
		
		
		Student s2= (Student) s1.clone();
	
		System.out.println("\ndata of student 2  after cloning:");
		System.out.println("name: "+s2.name+" Roll no:"+s2.studentId+" Address: "+s2.address.pinCode+","+s2.address.city);
		
		
		s2.name="Prabha";
		s2.studentId=193;
		s2.address.pinCode=202134;
		s2.address.city="kanpur";
		
		System.out.println("\ndata of student 1 after making changes to cloned s2:");
		System.out.println("name: "+s1.name+" Roll no:"+s1.studentId+" Address: "+s1.address.pinCode+","+s1.address.city);
		System.out.println("\ndata of student 2 after making changes to cloned s2:");
		System.out.println("name: "+s2.name+" Roll no:"+s2.studentId+" Address: "+s2.address.pinCode+","+s2.address.city);
	}

}
