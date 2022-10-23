package com.locks.threads;
import java.util.concurrent.locks.ReentrantLock;

public class Table implements Runnable{
     ReentrantLock re;
    
     public Table(ReentrantLock re) {
    	this.re=re;
    }
	public void run() {
		re.lock();
		try {
		    for(int i=0;i<5;i++) {
			    System.out.println(i*i);
		     }
		    Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		finally {
			re.unlock();
			System.out.println("releasing lock ");
		}
	}
}
