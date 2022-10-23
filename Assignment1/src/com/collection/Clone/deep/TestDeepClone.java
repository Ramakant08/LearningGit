package com.collection.Clone.deep;

public class TestDeepClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student1 s1= new Student1();
		s1.name="Pratibha";
		s1.studentId=103;
		s1.address1=new Address1(212323,"Delhi");
		
		System.out.println("data of student 1");
		System.out.println("name: "+s1.name+" Roll no:"+s1.studentId+" Address: "+s1.address1.pinCode+","+s1.address1.city);
		
		//cloning performed here
		Student1 s2= new Student1();
		s2.name="Prabha";
		s2.studentId=101;
		s2.address1=(Address1)s1.address1.clone();
		
		System.out.println("\ndata of student 2  after cloning:");
		System.out.println("name: "+s2.name+" Roll no:"+s2.studentId+" Address: "+s2.address1.pinCode+","+s2.address1.city); 
		
		//changing cloned object's values
		
		s2.address1.city="kanpur";
		
		System.out.println("\ndata of student 1 after making changes to cloning:");
		System.out.println("name: "+s1.name+" Roll no:"+s1.studentId+" Address: "+s1.address1.pinCode+","+s1.address1.city);
		System.out.println("\ndata of student 2 after making changes to cloning:");
		System.out.println("name: "+s2.name+" Roll no:"+s2.studentId+" Address: "+s2.address1.pinCode+","+s2.address1.city);
		
	}

}
