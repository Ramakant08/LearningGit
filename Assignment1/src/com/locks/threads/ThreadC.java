package com.locks.threads;

public class ThreadC {
  public static void main(String args[]) {
	 ThreadD d=new ThreadD();
	 d.start();
	 
	 synchronized(d){
	  try {
		  System.out.println("waiting for b to complete");
		  d.wait();
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	 
	 System.out.println("total:"+d.total);
	 
	 }
  }
}
