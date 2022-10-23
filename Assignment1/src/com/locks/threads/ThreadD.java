package com.locks.threads;

public class ThreadD extends Thread{
  int total;
  
  public void run() {
	  synchronized(this) {
	  for(int i=0;i<100;i++){
		  total+=i;
	     }
	  System.out.println("notify to c");
	  notify(); 
	  }
  }
}
