package com.Threads;

public class ThreadDemo{
	public static void main(String args[]) {
		RunnableDemo runnableDemo= new RunnableDemo("thread 1");
		RunnableDemo runnableDemo1= new RunnableDemo("thread 2");
		//Thread thread1=new Thread(runnableDemo);
		//Thread thread2=new Thread(runnableDemo1);
		runnableDemo.run();
		runnableDemo1.run();
	}
}
