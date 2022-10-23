package com.latch.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Tester {
	
	public static void main(String args[]) {
		CountDownLatch latch = new CountDownLatch(4);
		Process process1 =new Process("process1", latch);
		Process process2 =new Process("process2", latch);
		Process process3 =new Process("process3", latch);
		Process process4 =new Process("process4", latch);
		
		System.out.println("Processes starting: ");
		process1.run();
		process2.run();
		process3.run();
		process4.run();
		
		try {
			
			latch.await();
			System.out.println("All process complete !");
			
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
	}
}
