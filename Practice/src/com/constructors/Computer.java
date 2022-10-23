package com.constructors;

public class Computer {
	int ipAddress;
	String comModel;
	public Computer() {
		System.out.println("Default constructor Invoked");
	}
	
	public Computer(int ipAddress, String comModel) {
		this.ipAddress = ipAddress;
		this.comModel = comModel;
		System.out.println("ipAddress: "+ipAddress);
		System.out.println("Computer Model: "+comModel);
	}
	
	

}
