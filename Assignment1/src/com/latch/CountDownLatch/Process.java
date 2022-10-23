package com.latch.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Process implements Runnable {
	private String name;
	private CountDownLatch latch;
	
	public Process(String name, CountDownLatch latch) {
		super();
		this.name = name;
		this.latch = latch;
	}
    @Override
	public void run() {
		// TODO Auto-generated method stub
    	try {
    		System.out.println(name+" is started ");
    		Thread.sleep(200);
    	}catch(InterruptedException ex) {
    		ex.printStackTrace();
    	}
    	System.out.println( name + " is Up and running.");
    	latch.countDown();
    	
	}
	

}
