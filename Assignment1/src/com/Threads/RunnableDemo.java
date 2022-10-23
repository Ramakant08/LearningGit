package com.Threads;

public class RunnableDemo implements Runnable {
private Thread t;
private String threadName;
RunnableDemo(String name){
	threadName=name;
}
public void run() {
	System.out.println("thread is running "+threadName);
	try {
		for(int i=0;i<3;i++) {
			System.out.println("thread: "+threadName+" i:"+i);
			Thread.sleep(500);
		}
	}
	catch(InterruptedException ex){
		System.out.println("exception in thread");
	}
}
}