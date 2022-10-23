package com.Threads;

import java.util.concurrent.atomic.AtomicInteger;

public class WithoutAtomic extends Thread{
	
	AtomicInteger count;

	public WithoutAtomic () {
		count=new AtomicInteger();
	}
    
    public void run() {
    	int max=1_00_00_000;
    	for(int i=0;i<max;i++) {
    	   count.addAndGet(1); // 1 because we are increasing the count by 1 only
    	   // if without lock: 
    	   // lock.lock() the resource
    	   //count++
    	   //lock.unlock();OR
    	   //use synchronize{count++;}
    	}
    }

}
