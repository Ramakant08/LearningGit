package com.collection.Clone.deep;

public class Address1 implements Cloneable {

	int pinCode;
	  String city;
	   public Address1() {
		   
	   }
	   public Address1(int pinCode, String city) {
		   this.pinCode=pinCode;
		   this.city=city;
	   }
	  
		@Override
		protected Object clone() throws CloneNotSupportedException{
			return super.clone();
		}

}
