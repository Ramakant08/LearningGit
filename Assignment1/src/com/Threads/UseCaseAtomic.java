package com.Threads;

public class UseCaseAtomic {

  public static void main(String args[]) throws InterruptedException {
	  WithoutAtomic withoutAtomic= new WithoutAtomic();
	  Thread t1= new Thread(withoutAtomic,"first");
	  Thread t2= new Thread(withoutAtomic,"second");
	  t1.start();
	  t2.start();
	  t1.join();
	  t2.join();
	  System.out.println("final count value "+withoutAtomic.count);
	  
  }
}
