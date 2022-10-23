package com.java8.functionalInterface;

public class BMW implements Car{
	String name;
	float speed;
	float distance;
	
    public BMW() {
		super();
		this.name = name;
		this.speed = speed;
		this.distance = distance;
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("acceleration: ");
	}

	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		
	}
    public void non_abstract() {
    	System.out.println("implementation of non abstract here");
    }
    
    public static void Static_method() {
    	System.out.println("implementation of non abstract here");
    }
    
    public static void main(String args[]) {
    	BMW bmw= new BMW();
    	
    }
}
