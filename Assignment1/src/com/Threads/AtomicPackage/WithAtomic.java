package com.Threads.AtomicPackage;

import java.util.concurrent.atomic.AtomicInteger;

public class WithAtomic extends Thread {
   AtomicInteger sum;
   public WithAtomic (){
	   sum=new AtomicInteger();
   }
   // to print the sum of n numbers;
   public void run() {
	   int max=5;
	   for(int i=0;i<max;i++) {
		   sum.addAndGet(i);
		   System.out.println("sum of thread: "+sum);
	   }
	   
   }
   
}
