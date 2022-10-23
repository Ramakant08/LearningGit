package com.Threads;

public class MultiThread extends Thread{
 
	public void run() {
		System.out.println("Our first thread");
		//end of execution
		try {
		for(int i=0;i<5;i++) {
			System.out.println("i:"+i);
			Thread.sleep(500);
		   }
		}
		catch(InterruptedException ex) {
			System.out.println("exception in thread"+ex);
		}
		
	}
	public static void main(String args[]) {
		MultiThread multiThread=new MultiThread();
		multiThread.start();
		try {
			multiThread.join();
		}catch(Exception ex) {}
		MultiThread multiThread1=new MultiThread();
		multiThread1.start();
		try {
			multiThread1.join();
		}catch(Exception ex) {}
		MultiThread multiThread2=new MultiThread();
		multiThread2.start();
		try {
			multiThread2.join();
		}catch(Exception ex) {}
	}
}
