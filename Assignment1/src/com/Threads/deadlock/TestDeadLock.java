package com.Threads.deadlock;

public abstract class TestDeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final String rec1="yogesh";
        final String rec2="rajesh";
        
        Thread thread1=new Thread() {
        public void run() {
        	synchronized(rec1) {
        		System.out.println("Thread:1-locked Rec 1");
        		try {
        			Thread.sleep(100);
        		}catch(Exception e) {
        			
        		}
        	}
        	synchronized(rec2) {
        		System.out.println("Thread:1-locked Rec 1");
        		
        	}
        }
      };
        
        Thread thread2=new Thread() {
            public void run() {
            	synchronized(rec2) {
            		System.out.println("Thread:1-locked Rec 1");
            		try {
            			Thread.sleep(100);
            		}catch(Exception e) {
            			
            		}
            	}
            	synchronized(rec1) {
            		System.out.println("Thread:1-locked Rec 1");
            		
            	}
         
    	}

      };
      new Thread().start();
      new Thread().start();
   }
}